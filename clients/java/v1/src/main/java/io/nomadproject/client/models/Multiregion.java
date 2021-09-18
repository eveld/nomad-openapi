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
import io.nomadproject.client.models.MultiregionRegion;
import io.nomadproject.client.models.MultiregionStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Multiregion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Multiregion {
  public static final String SERIALIZED_NAME_REGIONS = "Regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<MultiregionRegion> regions = null;

  public static final String SERIALIZED_NAME_STRATEGY = "Strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private MultiregionStrategy strategy;


  public Multiregion regions(List<MultiregionRegion> regions) {
    
    this.regions = regions;
    return this;
  }

  public Multiregion addRegionsItem(MultiregionRegion regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<MultiregionRegion>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MultiregionRegion> getRegions() {
    return regions;
  }


  public void setRegions(List<MultiregionRegion> regions) {
    this.regions = regions;
  }


  public Multiregion strategy(MultiregionStrategy strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MultiregionStrategy getStrategy() {
    return strategy;
  }


  public void setStrategy(MultiregionStrategy strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Multiregion multiregion = (Multiregion) o;
    return Objects.equals(this.regions, multiregion.regions) &&
        Objects.equals(this.strategy, multiregion.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Multiregion {\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

