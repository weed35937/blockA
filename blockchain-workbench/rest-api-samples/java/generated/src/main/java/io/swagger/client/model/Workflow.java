/*
 * Azure Blockchain Workbench REST API
 * The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.WorkflowFunction;
import io.swagger.client.model.WorkflowProperty;
import io.swagger.client.model.WorkflowState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Workflow
 */

public class Workflow {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("applicationId")
  private Integer applicationId = null;

  @SerializedName("constructorId")
  private Integer constructorId = null;

  @SerializedName("startStateId")
  private Integer startStateId = null;

  @SerializedName("initiators")
  private List<String> initiators = null;

  @SerializedName("properties")
  private List<WorkflowProperty> properties = null;

  @SerializedName("constructor")
  private WorkflowFunction constructor = null;

  @SerializedName("functions")
  private List<WorkflowFunction> functions = null;

  @SerializedName("startState")
  private WorkflowState startState = null;

  @SerializedName("states")
  private List<WorkflowState> states = null;

  public Workflow id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Workflow name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Workflow description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Workflow displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Workflow applicationId(Integer applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

  public Workflow constructorId(Integer constructorId) {
    this.constructorId = constructorId;
    return this;
  }

   /**
   * Get constructorId
   * @return constructorId
  **/
  @ApiModelProperty(value = "")
  public Integer getConstructorId() {
    return constructorId;
  }

  public void setConstructorId(Integer constructorId) {
    this.constructorId = constructorId;
  }

  public Workflow startStateId(Integer startStateId) {
    this.startStateId = startStateId;
    return this;
  }

   /**
   * Get startStateId
   * @return startStateId
  **/
  @ApiModelProperty(value = "")
  public Integer getStartStateId() {
    return startStateId;
  }

  public void setStartStateId(Integer startStateId) {
    this.startStateId = startStateId;
  }

  public Workflow initiators(List<String> initiators) {
    this.initiators = initiators;
    return this;
  }

  public Workflow addInitiatorsItem(String initiatorsItem) {
    if (this.initiators == null) {
      this.initiators = new ArrayList<String>();
    }
    this.initiators.add(initiatorsItem);
    return this;
  }

   /**
   * Get initiators
   * @return initiators
  **/
  @ApiModelProperty(value = "")
  public List<String> getInitiators() {
    return initiators;
  }

  public void setInitiators(List<String> initiators) {
    this.initiators = initiators;
  }

  public Workflow properties(List<WorkflowProperty> properties) {
    this.properties = properties;
    return this;
  }

  public Workflow addPropertiesItem(WorkflowProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<WorkflowProperty>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public List<WorkflowProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<WorkflowProperty> properties) {
    this.properties = properties;
  }

  public Workflow constructor(WorkflowFunction constructor) {
    this.constructor = constructor;
    return this;
  }

   /**
   * Get constructor
   * @return constructor
  **/
  @ApiModelProperty(value = "")
  public WorkflowFunction getConstructor() {
    return constructor;
  }

  public void setConstructor(WorkflowFunction constructor) {
    this.constructor = constructor;
  }

  public Workflow functions(List<WorkflowFunction> functions) {
    this.functions = functions;
    return this;
  }

  public Workflow addFunctionsItem(WorkflowFunction functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<WorkflowFunction>();
    }
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * Get functions
   * @return functions
  **/
  @ApiModelProperty(value = "")
  public List<WorkflowFunction> getFunctions() {
    return functions;
  }

  public void setFunctions(List<WorkflowFunction> functions) {
    this.functions = functions;
  }

  public Workflow startState(WorkflowState startState) {
    this.startState = startState;
    return this;
  }

   /**
   * Get startState
   * @return startState
  **/
  @ApiModelProperty(value = "")
  public WorkflowState getStartState() {
    return startState;
  }

  public void setStartState(WorkflowState startState) {
    this.startState = startState;
  }

  public Workflow states(List<WorkflowState> states) {
    this.states = states;
    return this;
  }

  public Workflow addStatesItem(WorkflowState statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<WorkflowState>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Get states
   * @return states
  **/
  @ApiModelProperty(value = "")
  public List<WorkflowState> getStates() {
    return states;
  }

  public void setStates(List<WorkflowState> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.name, workflow.name) &&
        Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.displayName, workflow.displayName) &&
        Objects.equals(this.applicationId, workflow.applicationId) &&
        Objects.equals(this.constructorId, workflow.constructorId) &&
        Objects.equals(this.startStateId, workflow.startStateId) &&
        Objects.equals(this.initiators, workflow.initiators) &&
        Objects.equals(this.properties, workflow.properties) &&
        Objects.equals(this.constructor, workflow.constructor) &&
        Objects.equals(this.functions, workflow.functions) &&
        Objects.equals(this.startState, workflow.startState) &&
        Objects.equals(this.states, workflow.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, displayName, applicationId, constructorId, startStateId, initiators, properties, constructor, functions, startState, states);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    constructorId: ").append(toIndentedString(constructorId)).append("\n");
    sb.append("    startStateId: ").append(toIndentedString(startStateId)).append("\n");
    sb.append("    initiators: ").append(toIndentedString(initiators)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    constructor: ").append(toIndentedString(constructor)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    startState: ").append(toIndentedString(startState)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

