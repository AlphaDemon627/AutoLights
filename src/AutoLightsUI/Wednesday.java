/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoLightsUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "wednesday", catalog = "autolightsdb2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Wednesday.findAll", query = "SELECT w FROM Wednesday w"),
    @NamedQuery(name = "Wednesday.findByEntryId", query = "SELECT w FROM Wednesday w WHERE w.entryId = :entryId"),
    @NamedQuery(name = "Wednesday.findByMovementId", query = "SELECT w FROM Wednesday w WHERE w.movementId = :movementId"),
    @NamedQuery(name = "Wednesday.findByTimeId", query = "SELECT w FROM Wednesday w WHERE w.timeId = :timeId"),
    @NamedQuery(name = "Wednesday.findByDay", query = "SELECT w FROM Wednesday w WHERE w.day = :day"),
    @NamedQuery(name = "Wednesday.findByDate", query = "SELECT w FROM Wednesday w WHERE w.date = :date"),
    @NamedQuery(name = "Wednesday.findByLgvCount", query = "SELECT w FROM Wednesday w WHERE w.lgvCount = :lgvCount"),
    @NamedQuery(name = "Wednesday.findByHgvCount", query = "SELECT w FROM Wednesday w WHERE w.hgvCount = :hgvCount"),
    @NamedQuery(name = "Wednesday.findByTotalVehCount", query = "SELECT w FROM Wednesday w WHERE w.totalVehCount = :totalVehCount")})
public class Wednesday implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entry_id")
    private Integer entryId;
    @Column(name = "movement_id")
    private String movementId;
    @Column(name = "time_id")
    private Integer timeId;
    @Column(name = "day")
    private String day;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "lgv_count")
    private Integer lgvCount;
    @Column(name = "hgv_count")
    private Integer hgvCount;
    @Column(name = "total_veh_count")
    private Integer totalVehCount;

    public Wednesday() {
    }

    public Wednesday(Integer entryId) {
        this.entryId = entryId;
    }

    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        Integer oldEntryId = this.entryId;
        this.entryId = entryId;
        changeSupport.firePropertyChange("entryId", oldEntryId, entryId);
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        String oldMovementId = this.movementId;
        this.movementId = movementId;
        changeSupport.firePropertyChange("movementId", oldMovementId, movementId);
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        Integer oldTimeId = this.timeId;
        this.timeId = timeId;
        changeSupport.firePropertyChange("timeId", oldTimeId, timeId);
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        String oldDay = this.day;
        this.day = day;
        changeSupport.firePropertyChange("day", oldDay, day);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Integer getLgvCount() {
        return lgvCount;
    }

    public void setLgvCount(Integer lgvCount) {
        Integer oldLgvCount = this.lgvCount;
        this.lgvCount = lgvCount;
        changeSupport.firePropertyChange("lgvCount", oldLgvCount, lgvCount);
    }

    public Integer getHgvCount() {
        return hgvCount;
    }

    public void setHgvCount(Integer hgvCount) {
        Integer oldHgvCount = this.hgvCount;
        this.hgvCount = hgvCount;
        changeSupport.firePropertyChange("hgvCount", oldHgvCount, hgvCount);
    }

    public Integer getTotalVehCount() {
        return totalVehCount;
    }

    public void setTotalVehCount(Integer totalVehCount) {
        Integer oldTotalVehCount = this.totalVehCount;
        this.totalVehCount = totalVehCount;
        changeSupport.firePropertyChange("totalVehCount", oldTotalVehCount, totalVehCount);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entryId != null ? entryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wednesday)) {
            return false;
        }
        Wednesday other = (Wednesday) object;
        if ((this.entryId == null && other.entryId != null) || (this.entryId != null && !this.entryId.equals(other.entryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AutoLightsUI.Wednesday[ entryId=" + entryId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
