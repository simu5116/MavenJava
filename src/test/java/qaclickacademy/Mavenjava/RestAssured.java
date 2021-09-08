package qaclickacademy.Mavenjava;

public class RestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * RestAssured.baseURI="www.google.com";
		 * 
		 * String response= given().Pathparam("userid",2).queryParams("key","value")
		 * .header("Content-Type","application-json")
		 * .body(payload.Addplace())----------------------------this payload is a class where we have add place as static method
		 * .when().post("/maps/addplaceapi")
		 * .then().log().all()
		 * .assertThat().statusCode(200).body("scope",equalTo("APP"))
		 * .header("server","apache/tomcat").extract().response().asString();
		 */
		
		
		/*
		 * Jsonpath js=new JsonPath(response);    //for parsing json(string to json conversion)
		 * String place_id=js.getString("place_id");--------getString(pathofthejson);
		 */

		/*
		 * given().Pathparam("userid",2).queryParams("key","value")
		 * .header("Content-Type","application-json")
		 * .body(payload.updatePlace(place_id))----------------------------this payload is a class where we have add place as static method
		 * .when().put("/maps/addplaceapi")
		 * .then().log().all()
		 * .assertThat().statusCode(200).body("scope",equalTo("APP"))
		 * .header("server","apache/tomcat").extract().response().asString(); 
		 */
		
		/*
		 * String response=given().Pathparam("userid",2).queryParams("place_id",place_id)
		 * .when().get("/maps/getplace")
		 * .then().log().all()
		 * .extract().response().asString();
		 */
	}

}
