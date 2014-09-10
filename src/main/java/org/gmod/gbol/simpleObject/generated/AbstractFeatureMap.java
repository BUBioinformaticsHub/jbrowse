package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * FeatureMap generated by hbm2java
 */
public abstract class AbstractFeatureMap extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureMapId;
     private CVTerm unitType;
     private String name;
     private String description;
     private Set<FeatureMapPublication> featureMapPublications = new HashSet<FeatureMapPublication>(0);
     private Set<FeaturePosition> featurePositions = new HashSet<FeaturePosition>(0);
     private Set<FeatureRange> featureRanges = new HashSet<FeatureRange>(0);

    public AbstractFeatureMap() {
    }

    public AbstractFeatureMap(CVTerm unitType, String name, String description, Set<FeatureMapPublication> featureMapPublications, Set<FeaturePosition> featurePositions, Set<FeatureRange> featureRanges) {
       this.unitType = unitType;
       this.name = name;
       this.description = description;
       this.featureMapPublications = featureMapPublications;
       this.featurePositions = featurePositions;
       this.featureRanges = featureRanges;
    }
   
    public Integer getFeatureMapId() {
        return this.featureMapId;
    }
    
    public void setFeatureMapId(Integer featureMapId) {
        this.featureMapId = featureMapId;
    }
    public CVTerm getUnitType() {
        return this.unitType;
    }
    
    public void setUnitType(CVTerm unitType) {
        this.unitType = unitType;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<FeatureMapPublication> getFeatureMapPublications() {
        return this.featureMapPublications;
    }
    
    public void setFeatureMapPublications(Set<FeatureMapPublication> featureMapPublications) {
        this.featureMapPublications = featureMapPublications;
    }
    public Set<FeaturePosition> getFeaturePositions() {
        return this.featurePositions;
    }
    
    public void setFeaturePositions(Set<FeaturePosition> featurePositions) {
        this.featurePositions = featurePositions;
    }
    public Set<FeatureRange> getFeatureRanges() {
        return this.featureRanges;
    }
    
    public void setFeatureRanges(Set<FeatureRange> featureRanges) {
        this.featureRanges = featureRanges;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
         if ( (other == null ) ) return false;
         if ( !(other instanceof AbstractFeatureMap) ) return false;
         AbstractFeatureMap castOther = ( AbstractFeatureMap ) other; 
         
         return ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         
         
         
         return result;
   }   

public AbstractFeatureMap generateClone() {
    AbstractFeatureMap cloned = new FeatureMap(); 
           cloned.unitType = this.unitType;
           cloned.name = this.name;
           cloned.description = this.description;
           cloned.featureMapPublications = this.featureMapPublications;
           cloned.featurePositions = this.featurePositions;
           cloned.featureRanges = this.featureRanges;
    return cloned;
}


}

