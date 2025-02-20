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
import io.nomadproject.client.models.NetworkResource;
import io.nomadproject.client.models.NodeCpuResources;
import io.nomadproject.client.models.NodeDeviceResource;
import io.nomadproject.client.models.NodeDiskResources;
import io.nomadproject.client.models.NodeMemoryResources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NodeResources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NodeResources {
  public static final String SERIALIZED_NAME_CPU = "Cpu";
  @SerializedName(SERIALIZED_NAME_CPU)
  private NodeCpuResources cpu;

  public static final String SERIALIZED_NAME_DEVICES = "Devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<NodeDeviceResource> devices = null;

  public static final String SERIALIZED_NAME_DISK = "Disk";
  @SerializedName(SERIALIZED_NAME_DISK)
  private NodeDiskResources disk;

  public static final String SERIALIZED_NAME_MEMORY = "Memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private NodeMemoryResources memory;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<NetworkResource> networks = null;


  public NodeResources cpu(NodeCpuResources cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeCpuResources getCpu() {
    return cpu;
  }


  public void setCpu(NodeCpuResources cpu) {
    this.cpu = cpu;
  }


  public NodeResources devices(List<NodeDeviceResource> devices) {
    
    this.devices = devices;
    return this;
  }

  public NodeResources addDevicesItem(NodeDeviceResource devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<NodeDeviceResource>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NodeDeviceResource> getDevices() {
    return devices;
  }


  public void setDevices(List<NodeDeviceResource> devices) {
    this.devices = devices;
  }


  public NodeResources disk(NodeDiskResources disk) {
    
    this.disk = disk;
    return this;
  }

   /**
   * Get disk
   * @return disk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeDiskResources getDisk() {
    return disk;
  }


  public void setDisk(NodeDiskResources disk) {
    this.disk = disk;
  }


  public NodeResources memory(NodeMemoryResources memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NodeMemoryResources getMemory() {
    return memory;
  }


  public void setMemory(NodeMemoryResources memory) {
    this.memory = memory;
  }


  public NodeResources networks(List<NetworkResource> networks) {
    
    this.networks = networks;
    return this;
  }

  public NodeResources addNetworksItem(NetworkResource networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<NetworkResource>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Get networks
   * @return networks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NetworkResource> getNetworks() {
    return networks;
  }


  public void setNetworks(List<NetworkResource> networks) {
    this.networks = networks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeResources nodeResources = (NodeResources) o;
    return Objects.equals(this.cpu, nodeResources.cpu) &&
        Objects.equals(this.devices, nodeResources.devices) &&
        Objects.equals(this.disk, nodeResources.disk) &&
        Objects.equals(this.memory, nodeResources.memory) &&
        Objects.equals(this.networks, nodeResources.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpu, devices, disk, memory, networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeResources {\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

