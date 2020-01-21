/*
 * Warenkorb REST Service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.swisslife.warenkorb.server.rest.model;

import java.util.Objects;
import java.util.Arrays;
import ch.swisslife.warenkorb.server.rest.model.KundeDto;
import ch.swisslife.warenkorb.server.rest.model.WarenkorbDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BestellungDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-21T11:17:18.917+01:00")
public class BestellungDto {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warenkorb")
  private WarenkorbDto warenkorb = null;

  @SerializedName("kunde")
  private KundeDto kunde = null;

  public BestellungDto id(Integer id) {
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

  public BestellungDto warenkorb(WarenkorbDto warenkorb) {
    this.warenkorb = warenkorb;
    return this;
  }

   /**
   * Get warenkorb
   * @return warenkorb
  **/
  @ApiModelProperty(value = "")
  public WarenkorbDto getWarenkorb() {
    return warenkorb;
  }

  public void setWarenkorb(WarenkorbDto warenkorb) {
    this.warenkorb = warenkorb;
  }

  public BestellungDto kunde(KundeDto kunde) {
    this.kunde = kunde;
    return this;
  }

   /**
   * Get kunde
   * @return kunde
  **/
  @ApiModelProperty(value = "")
  public KundeDto getKunde() {
    return kunde;
  }

  public void setKunde(KundeDto kunde) {
    this.kunde = kunde;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BestellungDto bestellungDto = (BestellungDto) o;
    return Objects.equals(this.id, bestellungDto.id) &&
        Objects.equals(this.warenkorb, bestellungDto.warenkorb) &&
        Objects.equals(this.kunde, bestellungDto.kunde);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warenkorb, kunde);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BestellungDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warenkorb: ").append(toIndentedString(warenkorb)).append("\n");
    sb.append("    kunde: ").append(toIndentedString(kunde)).append("\n");
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

