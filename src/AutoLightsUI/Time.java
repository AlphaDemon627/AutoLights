/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoLightsUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mido Austin
 */
@Entity
@Table(name = "time", catalog = "autolightsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Time.findAll", query = "SELECT t FROM Time t"),
    @NamedQuery(name = "Time.findByTimeSlot", query = "SELECT t FROM Time t WHERE t.timeSlot = :timeSlot"),
    @NamedQuery(name = "Time.findByTimeId", query = "SELECT t FROM Time t WHERE t.timeId = :timeId")})
public class Time implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "time_slot")
    private String timeSlot;
    @Id
    @Basic(optional = false)
    @Column(name = "time_id")
    private Integer timeId;

    public Time() {
    }

    public Time(Integer timeId) {
        this.timeId = timeId;
    }

    public Time(Integer timeId, String timeSlot) {
        this.timeId = timeId;
        this.timeSlot = timeSlot;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        String oldTimeSlot = this.timeSlot;
        this.timeSlot = timeSlot;
        changeSupport.firePropertyChange("timeSlot", oldTimeSlot, timeSlot);
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        Integer oldTimeId = this.timeId;
        this.timeId = timeId;
        changeSupport.firePropertyChange("timeId", oldTimeId, timeId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeId != null ? timeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Time)) {
            return false;
        }
        Time other = (Time) object;
        if ((this.timeId == null && other.timeId != null) || (this.timeId != null && !this.timeId.equals(other.timeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "autolights.Time[ timeId=" + timeId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
