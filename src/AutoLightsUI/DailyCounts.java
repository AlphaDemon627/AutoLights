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
@Table(name = "daily_counts", catalog = "autolightsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "DailyCounts.findAll", query = "SELECT d FROM DailyCounts d"),
    //days
        @NamedQuery(name = "DailyCounts.findByMonDay", query = "SELECT d FROM DailyCounts d WHERE d.day = 'monday'"),
        @NamedQuery(name = "DailyCounts.findByTueDay", query = "SELECT d FROM DailyCounts d WHERE d.day = 'tuesday'"),
        @NamedQuery(name = "DailyCounts.findByWedDay", query = "SELECT d FROM DailyCounts d WHERE d.day = 'wednesday'"),
        @NamedQuery(name = "DailyCounts.findByThuDay", query = "SELECT d FROM DailyCounts d WHERE d.day = 'thursday'"),
        @NamedQuery(name = "DailyCounts.findByFriDay", query = "SELECT d FROM DailyCounts d WHERE d.day = 'friday'"),
        @NamedQuery(name = "DailyCounts.findBySatDay", query = "SELECT d FROM DailyCounts d WHERE d.day = 'saturday'"),
    //end of days
    @NamedQuery(name = "DailyCounts.findByMovementId", query = "SELECT d FROM DailyCounts d WHERE d.movementId = :movementId"),
    @NamedQuery(name = "DailyCounts.findByTimeId", query = "SELECT d FROM DailyCounts d WHERE d.timeId = :timeId"),
    @NamedQuery(name = "DailyCounts.findByDay", query = "SELECT d FROM DailyCounts d WHERE d.day = :day"),
    @NamedQuery(name = "DailyCounts.findByDate", query = "SELECT d FROM DailyCounts d WHERE d.date = :date"),
    @NamedQuery(name = "DailyCounts.findByHgvCount", query = "SELECT d FROM DailyCounts d WHERE d.hgvCount = :hgvCount"),
    @NamedQuery(name = "DailyCounts.findByLgvCount", query = "SELECT d FROM DailyCounts d WHERE d.lgvCount = :lgvCount"),
    @NamedQuery(name = "DailyCounts.findByTotalVehCount", query = "SELECT d FROM DailyCounts d WHERE d.totalVehCount = :totalVehCount")})
public class DailyCounts implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "movement_id")
    private String movementId;
    @Basic(optional = false)
    @Column(name = "time_id")
    private int timeId;
    @Basic(optional = false)
    @Column(name = "day")
    private String day;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "hgv_count")
    private int hgvCount;
    @Basic(optional = false)
    @Column(name = "lgv_count")
    private int lgvCount;
    @Basic(optional = false)
    @Column(name = "total_veh_count")
    private int totalVehCount;

    public DailyCounts() {
    }

    public DailyCounts(String movementId) {
        this.movementId = movementId;
    }

    public DailyCounts(String movementId, int timeId, String day, Date date, int hgvCount, int lgvCount, int totalVehCount) {
        this.movementId = movementId;
        this.timeId = timeId;
        this.day = day;
        this.date = date;
        this.hgvCount = hgvCount;
        this.lgvCount = lgvCount;
        this.totalVehCount = totalVehCount;
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        String oldMovementId = this.movementId;
        this.movementId = movementId;
        changeSupport.firePropertyChange("movementId", oldMovementId, movementId);
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        int oldTimeId = this.timeId;
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

    public int getHgvCount() {
        return hgvCount;
    }

    public void setHgvCount(int hgvCount) {
        int oldHgvCount = this.hgvCount;
        this.hgvCount = hgvCount;
        changeSupport.firePropertyChange("hgvCount", oldHgvCount, hgvCount);
    }

    public int getLgvCount() {
        return lgvCount;
    }

    public void setLgvCount(int lgvCount) {
        int oldLgvCount = this.lgvCount;
        this.lgvCount = lgvCount;
        changeSupport.firePropertyChange("lgvCount", oldLgvCount, lgvCount);
    }

    public int getTotalVehCount() {
        return totalVehCount;
    }

    public void setTotalVehCount(int totalVehCount) {
        int oldTotalVehCount = this.totalVehCount;
        this.totalVehCount = totalVehCount;
        changeSupport.firePropertyChange("totalVehCount", oldTotalVehCount, totalVehCount);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movementId != null ? movementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DailyCounts)) {
            return false;
        }
        DailyCounts other = (DailyCounts) object;
        if ((this.movementId == null && other.movementId != null) || (this.movementId != null && !this.movementId.equals(other.movementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "autolights.DailyCounts[ movementId=" + movementId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
