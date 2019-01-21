/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoLightsUI;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Mido Austin
 */
@Embeddable
public class HighestCountsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "movement_id")
    private String movementId;
    @Basic(optional = false)
    @Column(name = "time_id")
    private int timeId;

    public HighestCountsPK() {
    }

    public HighestCountsPK(String movementId, int timeId) {
        this.movementId = movementId;
        this.timeId = timeId;
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        this.movementId = movementId;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movementId != null ? movementId.hashCode() : 0);
        hash += (int) timeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HighestCountsPK)) {
            return false;
        }
        HighestCountsPK other = (HighestCountsPK) object;
        if ((this.movementId == null && other.movementId != null) || (this.movementId != null && !this.movementId.equals(other.movementId))) {
            return false;
        }
        if (this.timeId != other.timeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "autolights.HighestCountsPK[ movementId=" + movementId + ", timeId=" + timeId + " ]";
    }
    
}
