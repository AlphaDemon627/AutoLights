/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analysis;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Mido Austin
 */
@Entity
@Table(name = "events", catalog = "events", schema = "")
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e"),
    @NamedQuery(name = "Events.findByEventId", query = "SELECT e FROM Events e WHERE e.eventId = :eventId"),
    @NamedQuery(name = "Events.findByEventManager", query = "SELECT e FROM Events e WHERE e.eventManager = :eventManager"),
    @NamedQuery(name = "Events.findByEventVenue", query = "SELECT e FROM Events e WHERE e.eventVenue = :eventVenue"),
    @NamedQuery(name = "Events.findByEventIntersection", query = "SELECT e FROM Events e WHERE e.eventIntersection = :eventIntersection"),
    @NamedQuery(name = "Events.findByEventDate", query = "SELECT e FROM Events e WHERE e.eventDate = :eventDate"),
    @NamedQuery(name = "Events.findByEventDay", query = "SELECT e FROM Events e WHERE e.eventDay = :eventDay"),
    @NamedQuery(name = "Events.findByEventDescription", query = "SELECT e FROM Events e WHERE e.eventDescription = :eventDescription"),
    @NamedQuery(name = "Events.findByTimeIdStrt", query = "SELECT e FROM Events e WHERE e.timeIdStrt = :timeIdStrt"),
    @NamedQuery(name = "Events.findByTimeIdStp", query = "SELECT e FROM Events e WHERE e.timeIdStp = :timeIdStp")})
public class Events implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "event_id")
    private Integer eventId;
    @Basic(optional = false)
    @Column(name = "event_manager")
    private String eventManager;
    @Basic(optional = false)
    @Column(name = "event_venue")
    private String eventVenue;
    @Basic(optional = false)
    @Column(name = "event_intersection")
    private String eventIntersection;
    @Basic(optional = false)
    @Column(name = "event_date")
    @Temporal(TemporalType.DATE)
    private Date eventDate;
    @Basic(optional = false)
    @Column(name = "event_day")
    private String eventDay;
    @Basic(optional = false)
    @Column(name = "event_description")
    private String eventDescription;
    @Basic(optional = false)
    @Column(name = "time_id_strt")
    private int timeIdStrt;
    @Basic(optional = false)
    @Column(name = "time_id_stp")
    private int timeIdStp;

    public Events() {
    }

    public Events(Integer eventId) {
        this.eventId = eventId;
    }

    public Events(Integer eventId, String eventManager, String eventVenue, String eventIntersection, Date eventDate, String eventDay, String eventDescription, int timeIdStrt, int timeIdStp) {
        this.eventId = eventId;
        this.eventManager = eventManager;
        this.eventVenue = eventVenue;
        this.eventIntersection = eventIntersection;
        this.eventDate = eventDate;
        this.eventDay = eventDay;
        this.eventDescription = eventDescription;
        this.timeIdStrt = timeIdStrt;
        this.timeIdStp = timeIdStp;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        Integer oldEventId = this.eventId;
        this.eventId = eventId;
        changeSupport.firePropertyChange("eventId", oldEventId, eventId);
    }

    public String getEventManager() {
        return eventManager;
    }

    public void setEventManager(String eventManager) {
        String oldEventManager = this.eventManager;
        this.eventManager = eventManager;
        changeSupport.firePropertyChange("eventManager", oldEventManager, eventManager);
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        String oldEventVenue = this.eventVenue;
        this.eventVenue = eventVenue;
        changeSupport.firePropertyChange("eventVenue", oldEventVenue, eventVenue);
    }

    public String getEventIntersection() {
        return eventIntersection;
    }

    public void setEventIntersection(String eventIntersection) {
        String oldEventIntersection = this.eventIntersection;
        this.eventIntersection = eventIntersection;
        changeSupport.firePropertyChange("eventIntersection", oldEventIntersection, eventIntersection);
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        Date oldEventDate = this.eventDate;
        this.eventDate = eventDate;
        changeSupport.firePropertyChange("eventDate", oldEventDate, eventDate);
    }

    public String getEventDay() {
        return eventDay;
    }

    public void setEventDay(String eventDay) {
        String oldEventDay = this.eventDay;
        this.eventDay = eventDay;
        changeSupport.firePropertyChange("eventDay", oldEventDay, eventDay);
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        String oldEventDescription = this.eventDescription;
        this.eventDescription = eventDescription;
        changeSupport.firePropertyChange("eventDescription", oldEventDescription, eventDescription);
    }

    public int getTimeIdStrt() {
        return timeIdStrt;
    }

    public void setTimeIdStrt(int timeIdStrt) {
        int oldTimeIdStrt = this.timeIdStrt;
        this.timeIdStrt = timeIdStrt;
        changeSupport.firePropertyChange("timeIdStrt", oldTimeIdStrt, timeIdStrt);
    }

    public int getTimeIdStp() {
        return timeIdStp;
    }

    public void setTimeIdStp(int timeIdStp) {
        int oldTimeIdStp = this.timeIdStp;
        this.timeIdStp = timeIdStp;
        changeSupport.firePropertyChange("timeIdStp", oldTimeIdStp, timeIdStp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Analysis.Events[ eventId=" + eventId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
