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
import io.nomadproject.client.models.ConsulExposeConfig;
import io.nomadproject.client.models.ConsulUpstream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ConsulProxy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsulProxy {
  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Map<String, Object> config = null;

  public static final String SERIALIZED_NAME_EXPOSE_CONFIG = "ExposeConfig";
  @SerializedName(SERIALIZED_NAME_EXPOSE_CONFIG)
  private ConsulExposeConfig exposeConfig;

  public static final String SERIALIZED_NAME_LOCAL_SERVICE_ADDRESS = "LocalServiceAddress";
  @SerializedName(SERIALIZED_NAME_LOCAL_SERVICE_ADDRESS)
  private String localServiceAddress;

  public static final String SERIALIZED_NAME_LOCAL_SERVICE_PORT = "LocalServicePort";
  @SerializedName(SERIALIZED_NAME_LOCAL_SERVICE_PORT)
  private Integer localServicePort;

  public static final String SERIALIZED_NAME_UPSTREAMS = "Upstreams";
  @SerializedName(SERIALIZED_NAME_UPSTREAMS)
  private List<ConsulUpstream> upstreams = null;


  public ConsulProxy config(Map<String, Object> config) {
    
    this.config = config;
    return this;
  }

  public ConsulProxy putConfigItem(String key, Object configItem) {
    if (this.config == null) {
      this.config = new HashMap<String, Object>();
    }
    this.config.put(key, configItem);
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getConfig() {
    return config;
  }


  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }


  public ConsulProxy exposeConfig(ConsulExposeConfig exposeConfig) {
    
    this.exposeConfig = exposeConfig;
    return this;
  }

   /**
   * Get exposeConfig
   * @return exposeConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsulExposeConfig getExposeConfig() {
    return exposeConfig;
  }


  public void setExposeConfig(ConsulExposeConfig exposeConfig) {
    this.exposeConfig = exposeConfig;
  }


  public ConsulProxy localServiceAddress(String localServiceAddress) {
    
    this.localServiceAddress = localServiceAddress;
    return this;
  }

   /**
   * Get localServiceAddress
   * @return localServiceAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalServiceAddress() {
    return localServiceAddress;
  }


  public void setLocalServiceAddress(String localServiceAddress) {
    this.localServiceAddress = localServiceAddress;
  }


  public ConsulProxy localServicePort(Integer localServicePort) {
    
    this.localServicePort = localServicePort;
    return this;
  }

   /**
   * Get localServicePort
   * @return localServicePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLocalServicePort() {
    return localServicePort;
  }


  public void setLocalServicePort(Integer localServicePort) {
    this.localServicePort = localServicePort;
  }


  public ConsulProxy upstreams(List<ConsulUpstream> upstreams) {
    
    this.upstreams = upstreams;
    return this;
  }

  public ConsulProxy addUpstreamsItem(ConsulUpstream upstreamsItem) {
    if (this.upstreams == null) {
      this.upstreams = new ArrayList<ConsulUpstream>();
    }
    this.upstreams.add(upstreamsItem);
    return this;
  }

   /**
   * Get upstreams
   * @return upstreams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConsulUpstream> getUpstreams() {
    return upstreams;
  }


  public void setUpstreams(List<ConsulUpstream> upstreams) {
    this.upstreams = upstreams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsulProxy consulProxy = (ConsulProxy) o;
    return Objects.equals(this.config, consulProxy.config) &&
        Objects.equals(this.exposeConfig, consulProxy.exposeConfig) &&
        Objects.equals(this.localServiceAddress, consulProxy.localServiceAddress) &&
        Objects.equals(this.localServicePort, consulProxy.localServicePort) &&
        Objects.equals(this.upstreams, consulProxy.upstreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, exposeConfig, localServiceAddress, localServicePort, upstreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsulProxy {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    exposeConfig: ").append(toIndentedString(exposeConfig)).append("\n");
    sb.append("    localServiceAddress: ").append(toIndentedString(localServiceAddress)).append("\n");
    sb.append("    localServicePort: ").append(toIndentedString(localServicePort)).append("\n");
    sb.append("    upstreams: ").append(toIndentedString(upstreams)).append("\n");
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

