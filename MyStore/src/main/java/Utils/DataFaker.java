package Utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class DataFaker {

    static Faker faker = new Faker();

    public static String createRandomEmail(){
        Random r = new Random();
        int randomNumber = r.nextInt(0, 1001);
        return String.format("%s%s@test.com",faker.artist().name(),randomNumber);
    }

    public static String createRandomFirstName(){return faker.name().firstName();}

    public static String createRandomLastName(){return  faker.name().lastName();}

    public static String createRandomPassword(){
        Random r = new Random();
        int randomNumber = r.nextInt(0,1001);
        return String.format("PAss%s%s",faker.ancient().god(),randomNumber);
    }

    public static String createRandomPhoneNumber(){return faker.phoneNumber().cellPhone();}

    public static String createRandomZip(){
        Random n = new Random();
        int firstNumber = n.nextInt(1,99);
        Random m = new Random();
        int secondNumber = m.nextInt(100,999);
        return String.format("%s-%s",firstNumber,secondNumber);

    }

    public static String createRandomAlias(){return faker.ancient().titan();}

    public static String createRandomCity(){return faker.gameOfThrones().city();}

    public static String createRandomAddress(){return faker.address().streetAddress();}

}
