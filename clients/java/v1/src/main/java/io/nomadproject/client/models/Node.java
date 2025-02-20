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
import io.nomadproject.client.models.CSIInfo;
import io.nomadproject.client.models.DrainMetadata;
import io.nomadproject.client.models.DrainStrategy;
import io.nomadproject.client.models.DriverInfo;
import io.nomadproject.client.models.HostVolumeInfo;
import io.nomadproject.client.models.NodeEvent;
import io.nomadproject.client.models.NodeReservedResources;
import io.nomadproject.client.models.NodeResources;
import io.nomadproject.client.models.Resources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Node
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Node {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "Attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_CS_I_CONTROLLER_PLUGINS = "CSIControllerPlugins";
  @SerializedName(SERIALIZED_NAME_CS_I_CONTROLLER_PLUGINS)
  private Map<String, CSIInfo> csIControllerPlugins = null;

  public static final String SERIALIZED_NAME_CS_I_NODE_PLUGINS = "CSINodePlugins";
  @SerializedName(SERIALIZED_NAME_CS_I_NODE_PLUGINS)
  private Map<String, CSIInfo> csINodePlugins = null;

  public static final String SERIALIZED_NAME_CREATE_INDEX = "CreateIndex";
  @SerializedName(SERIALIZED_NAME_CREATE_INDEX)
  private Integer createIndex;

  public static final String SERIALIZED_NAME_DATACENTER = "Datacenter";
  @SerializedName(SERIALIZED_NAME_DATACENTER)
  private String datacenter;

  public static final String SERIALIZED_NAME_DRAIN = "Drain";
  @SerializedName(SERIALIZED_NAME_DRAIN)
  private Boolean drain;

  public static final String SERIALIZED_NAME_DRAIN_STRATEGY = "DrainStrategy";
  @SerializedName(SERIALIZED_NAME_DRAIN_STRATEGY)
  private DrainStrategy drainStrategy;

  public static final String SERIALIZED_NAME_DRIVERS = "Drivers";
  @SerializedName(SERIALIZED_NAME_DRIVERS)
  private Map<String, DriverInfo> drivers = null;

  public static final String SERIALIZED_NAME_EVENTS = "Events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<NodeEvent> events = null;

  public static final String SERIALIZED_NAME_HT_T_P_ADDR = "HTTPAddr";
  @SerializedName(SERIALIZED_NAME_HT_T_P_ADDR)
  private String htTPAddr;

  public static final String SERIALIZED_NAME_HOST_VOLUMES = "HostVolumes";
  @SerializedName(SERIALIZED_NAME_HOST_VOLUMES)
  private Map<String, HostVolumeInfo> hostVolumes = null;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_LAST_DRAIN = "LastDrain";
  @SerializedName(SERIALIZED_NAME_LAST_DRAIN)
  private DrainMetadata lastDrain;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_META = "Meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, String> meta = null;

  public static final String SERIALIZED_NAME_MODIFY_INDEX = "ModifyIndex";
  @SerializedName(SERIALIZED_NAME_MODIFY_INDEX)
  private Integer modifyIndex;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_CLASS = "NodeClass";
  @SerializedName(SERIALIZED_NAME_NODE_CLASS)
  private String nodeClass;

  public static final String SERIALIZED_NAME_NODE_RESOURCES = "NodeResources";
  @SerializedName(SERIALIZED_NAME_NODE_RESOURCES)
  private NodeResources nodeResources;

  public static final String SERIALIZED_NAME_RESERVED = "Reserved";
  @SerializedName(SERIALIZED_NAME_RESERVED)
  private Resources reserved;

  public static final String SERIALIZED_NAME_RESERVED_RESOURCES = "ReservedResources";
  @SerializedName(SERIALIZED_NAME_RESERVED_RESOURCES)
  private NodeReservedResources reservedResources;

  public static final String SERIALIZED_NAME_RESOURCES = "Resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Resources resources;

  public static final String SERIALIZED_NAME_SCHEDULING_ELIGIBILITY = "SchedulingEligibility";
  @SerializedName(SERIALIZED_NAME_SCHEDULING_ELIGIBILITY)
  private String schedulingEligibility;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "StatusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_STATUS_UPDATED_AT = "StatusUpdatedAt";
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATED_AT)
  private Long statusUpdatedAt;

  public static final String SERIALIZED_NAME_TL_S_ENABLED = "TLSEnabled";
  @SerializedName(SERIALIZED_NAME_TL_S_ENABLED)
  private Boolean tlSEnabled;


  public Node attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Node putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, String>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public Node csIControllerPlugins(Map<String, CSIInfo> csIControllerPlugins) {
    
    this.csIControllerPlugins = csIControllerPlugins;
    return this;
  }

  public Node putCsIControllerPluginsItem(String key, CSIInfo csIControllerPluginsItem) {
    if (this.csIControllerPlugins == null) {
      this.csIControllerPlugins = new HashMap<String, CSIInfo>();
    }
    this.csIControllerPlugins.put(key, csIControllerPluginsItem);
    return this;
  }

   /**
   * Get csIControllerPlugins
   * @return csIControllerPlugins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CSIInfo> getCsIControllerPlugins() {
    return csIControllerPlugins;
  }


  public void setCsIControllerPlugins(Map<String, CSIInfo> csIControllerPlugins) {
    this.csIControllerPlugins = csIControllerPlugins;
  }


  public Node csINodePlugins(Map<String, CSIInfo> csINodePlugins) {
    
    this.csINodePlugins = csINodePlugins;
    return this;
  }

  public Node putCsINodePluginsItem(String key, CSIInfo csINodePluginsItem) {
    if (this.csINodePlugins == null) {
      this.csINodePlugins = new HashMap<String, CSIInfo>();
    }
    this.csINodePlugins.put(key, csINodePluginsItem);
    return this;
  }

   /**
   * Get csINodePlugins
   * @return csINodePlugins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, CSIInfo> getCsINodePlugins() {
    return csINodePlugins;
  }


  public void setCsINodePlugins(Map<String, CSIInfo> csINodePlugins) {
    this.csINodePlugins = csINodePlugins;
  }


  public Node createIndex(Integer createIndex) {
    
    this.createIndex = createIndex;
    return this;
  }

   /**
   * Get createIndex
   * minimum: 0
   * maximum: 384
   * @return createIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateIndex() {
    return createIndex;
  }


  public void setCreateIndex(Integer createIndex) {
    this.createIndex = createIndex;
  }


  public Node datacenter(String datacenter) {
    
    this.datacenter = datacenter;
    return this;
  }

   /**
   * Get datacenter
   * @return datacenter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatacenter() {
    return datacenter;
  }


  public void setDatacenter(String datacenter) {
    this.datacenter = datacenter;
  }


  public Node drain(Boolean drain) {
    
    this.drain = drain;
    return this;
  }

   /**
   * Get drain
   * @return drain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDrain() {
    return drain;
  }


  public void setDrain(Boolean drain) {
    this.drain = drain;
  }


  public Node drainStrategy(DrainStrategy drainStrategy) {
    
    this.drainStrategy = drainStrategy;
    return this;
  }

   /**
   * Get drainStrategy
   * @return drainStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DrainStrategy getDrainStrategy() {
    return drainStrategy;
  }


  public void setDrainStrategy(DrainStrategy drainStrategy) {
    this.drainStrategy = drainStrategy;
  }


  public Node drivers(Map<String, DriverInfo> drivers) {
    
    this.drivers = drivers;
    return this;
  }

  public Node putDriversItem(String key, DriverInfo driversItem) {
    if (this.drivers == null) {
      this.drivers = new HashMap<String, DriverInfo>();
    }
    this.drivers.put(key, driversItem);
    return this;
  }

   /**
   * Get drivers
   * @return drivers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, DriverInfo> getDrivers() {
    return drivers;
  }


  public void setDrivers(Map<String, DriverInfo> drivers) {
    this.drivers = drivers;
  }


  public Node events(List<NodeEvent> events) {
    
    this.events = events;
    return this;
  }

  public Node addEventsItem(NodeEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<NodeEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NodeEvent> getEvents() {
    return events;
  }


  public void setEvents(List<NodeEvent> events) {
    this.events = events;
  }


  public Node htTPAddr(String htTPAddr) {
    
    this.htTPAddr = htTPAddr;
    return this;
  }

   /**
   * Get htTPAddr
   * @return htTPAddr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHtTPAddr() {
    return htTPAddr;
  }


  public void setHtTPAddr(String htTPAddr) {
    this.htTPAddr = htTPAddr;
  }


  public Node hostVolumes(Map<String, HostVolumeInfo> hostVolumes) {
    
    this.hostVolumes = hostVolumes;
    return this;
  }

  public Node putHostVolumesItem(String key, HostVolumeInfo hostVolumesItem) {
    if (this.hostVolumes == null) {
      this.hostVolumes = new HashMap<String, HostVolumeInfo>();
    }
    this.hostVolumes.put(key, hostVolumesItem);
    return this;
  }

   /**
   * Get hostVolumes
   * @return hostVolumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, HostVolumeInfo> getHostVolumes() {
    return hostVolumes;
  }


  public void setHostVolumes(Map<String, HostVolumeInfo> hostVolumes) {
    this.hostVolumes = hostVolumes;
  }


  public Node ID(String ID) {
    
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


  public Node lastDrain(DrainMetadata lastDrain) {
    
    this.lastDrain = lastDrain;
    return this;
  }

   /**
   * Get lastDrain
   * @return lastDrain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DrainMetadata getLastDrain() {
    return lastDrain;
  }


  public void setLastDrain(DrainMetadata lastDrain) {
    this.lastDrain = lastDrain;
  }


  public Node links(Map<String, String> links) {
    
    this.links = links;
    return this;
  }

  public Node putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }


  public void setLinks(Map<String, String> links) {
    this.links = links;
  }


  public Node meta(Map<String, String> meta) {
    
    this.meta = meta;
    return this;
  }

  public Node putMetaItem(String key, String metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<String, String>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, String> meta) {
    this.meta = meta;
  }


  public Node modifyIndex(Integer modifyIndex) {
    
    this.modifyIndex = modifyIndex;
    return this;
  }

   /**
   * Get modifyIndex
   * minimum: 0
   * maximum: 384
   * @return modifyIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getModifyIndex() {
    return modifyIndex;
  }


  public void setModifyIndex(Integer modifyIndex) {
    this.modifyIndex = modifyIndex;
  }


  public Node name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Node nodeClass(String nodeClass) {
    
    this.nodeClass = nodeClass;
    return this;
  }

   /**
   * Get nodeClass
   * @return nodeClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeClass() {
    return nodeClass;
  }


  public void setNodeClass(String nodeClass) {
    this.nodeClass = nodeClass;
  }


  public Node nodeResources(NodeResources nodeResources) {
    
    this.nodeResources = nodeResources;
    return this;
  }

   /**
   * Get nodeResources
   * @return nodeResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeResources getNodeResources() {
    return nodeResources;
  }


  public void setNodeResources(NodeResources nodeResources) {
    this.nodeResources = nodeResources;
  }


  public Node reserved(Resources reserved) {
    
    this.reserved = reserved;
    return this;
  }

   /**
   * Get reserved
   * @return reserved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Resources getReserved() {
    return reserved;
  }


  public void setReserved(Resources reserved) {
    this.reserved = reserved;
  }


  public Node reservedResources(NodeReservedResources reservedResources) {
    
    this.reservedResources = reservedResources;
    return this;
  }

   /**
   * Get reservedResources
   * @return reservedResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeReservedResources getReservedResources() {
    return reservedResources;
  }


  public void setReservedResources(NodeReservedResources reservedResources) {
    this.reservedResources = reservedResources;
  }


  public Node resources(Resources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Resources getResources() {
    return resources;
  }


  public void setResources(Resources resources) {
    this.resources = resources;
  }


  public Node schedulingEligibility(String schedulingEligibility) {
    
    this.schedulingEligibility = schedulingEligibility;
    return this;
  }

   /**
   * Get schedulingEligibility
   * @return schedulingEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedulingEligibility() {
    return schedulingEligibility;
  }


  public void setSchedulingEligibility(String schedulingEligibility) {
    this.schedulingEligibility = schedulingEligibility;
  }


  public Node status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Node statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public Node statusUpdatedAt(Long statusUpdatedAt) {
    
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }

   /**
   * Get statusUpdatedAt
   * @return statusUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStatusUpdatedAt() {
    return statusUpdatedAt;
  }


  public void setStatusUpdatedAt(Long statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
  }


  public Node tlSEnabled(Boolean tlSEnabled) {
    
    this.tlSEnabled = tlSEnabled;
    return this;
  }

   /**
   * Get tlSEnabled
   * @return tlSEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTlSEnabled() {
    return tlSEnabled;
  }


  public void setTlSEnabled(Boolean tlSEnabled) {
    this.tlSEnabled = tlSEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.attributes, node.attributes) &&
        Objects.equals(this.csIControllerPlugins, node.csIControllerPlugins) &&
        Objects.equals(this.csINodePlugins, node.csINodePlugins) &&
        Objects.equals(this.createIndex, node.createIndex) &&
        Objects.equals(this.datacenter, node.datacenter) &&
        Objects.equals(this.drain, node.drain) &&
        Objects.equals(this.drainStrategy, node.drainStrategy) &&
        Objects.equals(this.drivers, node.drivers) &&
        Objects.equals(this.events, node.events) &&
        Objects.equals(this.htTPAddr, node.htTPAddr) &&
        Objects.equals(this.hostVolumes, node.hostVolumes) &&
        Objects.equals(this.ID, node.ID) &&
        Objects.equals(this.lastDrain, node.lastDrain) &&
        Objects.equals(this.links, node.links) &&
        Objects.equals(this.meta, node.meta) &&
        Objects.equals(this.modifyIndex, node.modifyIndex) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.nodeClass, node.nodeClass) &&
        Objects.equals(this.nodeResources, node.nodeResources) &&
        Objects.equals(this.reserved, node.reserved) &&
        Objects.equals(this.reservedResources, node.reservedResources) &&
        Objects.equals(this.resources, node.resources) &&
        Objects.equals(this.schedulingEligibility, node.schedulingEligibility) &&
        Objects.equals(this.status, node.status) &&
        Objects.equals(this.statusDescription, node.statusDescription) &&
        Objects.equals(this.statusUpdatedAt, node.statusUpdatedAt) &&
        Objects.equals(this.tlSEnabled, node.tlSEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, csIControllerPlugins, csINodePlugins, createIndex, datacenter, drain, drainStrategy, drivers, events, htTPAddr, hostVolumes, ID, lastDrain, links, meta, modifyIndex, name, nodeClass, nodeResources, reserved, reservedResources, resources, schedulingEligibility, status, statusDescription, statusUpdatedAt, tlSEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    csIControllerPlugins: ").append(toIndentedString(csIControllerPlugins)).append("\n");
    sb.append("    csINodePlugins: ").append(toIndentedString(csINodePlugins)).append("\n");
    sb.append("    createIndex: ").append(toIndentedString(createIndex)).append("\n");
    sb.append("    datacenter: ").append(toIndentedString(datacenter)).append("\n");
    sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
    sb.append("    drainStrategy: ").append(toIndentedString(drainStrategy)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    htTPAddr: ").append(toIndentedString(htTPAddr)).append("\n");
    sb.append("    hostVolumes: ").append(toIndentedString(hostVolumes)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    lastDrain: ").append(toIndentedString(lastDrain)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modifyIndex: ").append(toIndentedString(modifyIndex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeClass: ").append(toIndentedString(nodeClass)).append("\n");
    sb.append("    nodeResources: ").append(toIndentedString(nodeResources)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
    sb.append("    reservedResources: ").append(toIndentedString(reservedResources)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    schedulingEligibility: ").append(toIndentedString(schedulingEligibility)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    statusUpdatedAt: ").append(toIndentedString(statusUpdatedAt)).append("\n");
    sb.append("    tlSEnabled: ").append(toIndentedString(tlSEnabled)).append("\n");
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

