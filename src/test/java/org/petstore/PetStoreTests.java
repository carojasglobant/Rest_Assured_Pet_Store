package org.petstore;

import config.PetStoreConfig;
import config.PetStoreEndPoints;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static io.restassured.RestAssured.*;


public class PetStoreTests extends PetStoreConfig implements PetStoreEndPoints {
   @Test
    public void getPetByStatus(){
       given().
               queryParam("status", "available").
       when().
               get(PetStoreEndPoints.PET_BY_STATUS).
        then();
   }
}
