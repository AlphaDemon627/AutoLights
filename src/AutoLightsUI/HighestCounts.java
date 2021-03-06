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
@Table(name = "highest_counts", catalog = "autolightsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "HighestCounts.findAll", query = "SELECT h FROM HighestCounts h"),
    @NamedQuery(name = "HighestCounts.findByMovementId", query = "SELECT h FROM HighestCounts h WHERE h.entryId = :entryId"),
    @NamedQuery(name = "HighestCounts.findByTimeId", query = "SELECT h FROM HighestCounts h WHERE h.timeId = :timeId"),
    @NamedQuery(name = "HighestCounts.findByDay", query = "SELECT h FROM HighestCounts h WHERE h.day = :day"),
    @NamedQuery(name = "HighestCounts.findByDate", query = "SELECT h FROM HighestCounts h WHERE h.date = :date"),
    @NamedQuery(name = "HighestCounts.findByLgvCount", query = "SELECT h FROM HighestCounts h WHERE h.lgvCount = :lgvCount"),
    @NamedQuery(name = "HighestCounts.findByHgvCount", query = "SELECT h FROM HighestCounts h WHERE h.hgvCount = :hgvCount"),
    @NamedQuery(name = "HighestCounts.findByTotalVehCount", query = "SELECT h FROM HighestCounts h WHERE h.totalVehCount = :totalVehCount")})
public class HighestCounts implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "movement_id")
    private String movementId;
    @Column(name = "entry_id")
    private String entryId;
    @Column(name = "time_id")
    private String timeId;
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

    public HighestCounts() {
    }

    public HighestCounts(String entryId) {
        this.entryId = entryId;
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        String oldMovementId = this.entryId;
        this.entryId = movementId;
        changeSupport.firePropertyChange("movementId", oldMovementId, movementId);
    }

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        String oldTimeId = this.timeId;
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
        if (!(object instanceof HighestCounts)) {
            return false;
        }
        HighestCounts other = (HighestCounts) object;
        if ((this.entryId == null && other.entryId != null) || (this.entryId != null && !this.entryId.equals(other.entryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AutoLightsUI.HighestCounts[ entryId=" + entryId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
