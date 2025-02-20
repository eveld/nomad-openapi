/*
 * Nomad
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.4
 * Contact: support@hashicorp.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nomadproject.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.nomadproject.client.models.CSITopology;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CSINodeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CSINodeInfo {
  public static final String SERIALIZED_NAME_ACCESSIBLE_TOPOLOGY = "AccessibleTopology";
  @SerializedName(SERIALIZED_NAME_ACCESSIBLE_TOPOLOGY)
  private CSITopology accessibleTopology;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_MAX_VOLUMES = "MaxVolumes";
  @SerializedName(SERIALIZED_NAME_MAX_VOLUMES)
  private Long maxVolumes;

  public static final String SERIALIZED_NAME_REQUIRES_NODE_STAGE_VOLUME = "RequiresNodeStageVolume";
  @SerializedName(SERIALIZED_NAME_REQUIRES_NODE_STAGE_VOLUME)
  private Boolean requiresNodeStageVolume;


  public CSINodeInfo accessibleTopology(CSITopology accessibleTopology) {
    
    this.accessibleTopology = accessibleTopology;
    return this;
  }

   /**
   * Get accessibleTopology
   * @return accessibleTopology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CSITopology getAccessibleTopology() {
    return accessibleTopology;
  }


  public void setAccessibleTopology(CSITopology accessibleTopology) {
    this.accessibleTopology = accessibleTopology;
  }


  public CSINodeInfo ID(String ID) {
    
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public CSINodeInfo maxVolumes(Long maxVolumes) {
    
    this.maxVolumes = maxVolumes;
    return this;
  }

   /**
   * Get maxVolumes
   * @return maxVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxVolumes() {
    return maxVolumes;
  }


  public void setMaxVolumes(Long maxVolumes) {
    this.maxVolumes = maxVolumes;
  }


  public CSINodeInfo requiresNodeStageVolume(Boolean requiresNodeStageVolume) {
    
    this.requiresNodeStageVolume = requiresNodeStageVolume;
    return this;
  }

   /**
   * Get requiresNodeStageVolume
   * @return requiresNodeStageVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresNodeStageVolume() {
    return requiresNodeStageVolume;
  }


  public void setRequiresNodeStageVolume(Boolean requiresNodeStageVolume) {
    this.requiresNodeStageVolume = requiresNodeStageVolume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSINodeInfo csINodeInfo = (CSINodeInfo) o;
    return Objects.equals(this.accessibleTopology, csINodeInfo.accessibleTopology) &&
        Objects.equals(this.ID, csINodeInfo.ID) &&
        Objects.equals(this.maxVolumes, csINodeInfo.maxVolumes) &&
        Objects.equals(this.requiresNodeStageVolume, csINodeInfo.requiresNodeStageVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibleTopology, ID, maxVolumes, requiresNodeStageVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSINodeInfo {\n");
    sb.append("    accessibleTopology: ").append(toIndentedString(accessibleTopology)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    maxVolumes: ").append(toIndentedString(maxVolumes)).append("\n");
    sb.append("    requiresNodeStageVolume: ").append(toIndentedString(requiresNodeStageVolume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

