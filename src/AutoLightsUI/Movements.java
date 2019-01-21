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
@Table(name = "movements", catalog = "autolightsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Movements.findAll", query = "SELECT m FROM Movements m"),
    @NamedQuery(name = "Movements.findByMovementId", query = "SELECT m FROM Movements m WHERE m.movementId = :movementId"),
    @NamedQuery(name = "Movements.findByIntersection", query = "SELECT m FROM Movements m WHERE m.intersection = :intersection"),
    @NamedQuery(name = "Movements.findByMovement", query = "SELECT m FROM Movements m WHERE m.movement = :movement"),
    @NamedQuery(name = "Movements.findByDirection", query = "SELECT m FROM Movements m WHERE m.direction = :direction"),
    @NamedQuery(name = "Movements.findByLocation", query = "SELECT m FROM Movements m WHERE m.location = :location")})
public class Movements implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "movement_id")
    private String movementId;
    @Basic(optional = false)
    @Column(name = "intersection")
    private String intersection;
    @Basic(optional = false)
    @Column(name = "movement")
    private String movement;
    @Basic(optional = false)
    @Column(name = "direction")
    private String direction;
    @Column(name = "location")
    private String location;

    public Movements() {
    }

    public Movements(String movementId) {
        this.movementId = movementId;
    }

    public Movements(String movementId, String intersection, String movement, String direction) {
        this.movementId = movementId;
        this.intersection = intersection;
        this.movement = movement;
        this.direction = direction;
    }

    public String getMovementId() {
        return movementId;
    }

    public void setMovementId(String movementId) {
        String oldMovementId = this.movementId;
        this.movementId = movementId;
        changeSupport.firePropertyChange("movementId", oldMovementId, movementId);
    }

    public String getIntersection() {
        return intersection;
    }

    public void setIntersection(String intersection) {
        String oldIntersection = this.intersection;
        this.intersection = intersection;
        changeSupport.firePropertyChange("intersection", oldIntersection, intersection);
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        String oldMovement = this.movement;
        this.movement = movement;
        changeSupport.firePropertyChange("movement", oldMovement, movement);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        String oldDirection = this.direction;
        this.direction = direction;
        changeSupport.firePropertyChange("direction", oldDirection, direction);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
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
        if (!(object instanceof Movements)) {
            return false;
        }
        Movements other = (Movements) object;
        if ((this.movementId == null && other.movementId != null) || (this.movementId != null && !this.movementId.equals(other.movementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "autolights.Movements[ movementId=" + movementId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
