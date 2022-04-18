# **HOROSCOPE**

# Information

* **Displays the horoscope by entering the birthday and month.**

# Technologies Used

* **JAVA**

# Contents

* The day and month are defined with an int, and the horoscope as a string expression.

* The error variable is defined with a boolean expression to check for errors in the code.

* Scanner class is defined to get month and day information from the user.

* The time interval is defined with if - else conditions.

* An error message was generated when the day and month were entered incorrectly.

<br />

```Java

        import java.util.Scanner;

        public class horoscope{

            public static void main(String[] args) {

            int month, day;

            String sign = "";

            boolean isError = false;

```

```Java

            Scanner input = new Scanner(System.in);


            System.out.print("Month of birth : ");

            month = input.nextInt();

            System.out.print("Day of birth : ");

            day = input.nextInt();

```
```Java

        if((month >= 1) && (month <= 12)){

            if(month == 1){

                if(day >= 1 && day <= 31){

                    if(day < 22){

                        sign = "Capricorn";

                    }else{

                        sign = "Aquarius";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 2){

                if(day >= 1 && day <= 28){

                    if(day < 20){

                        sign = "Aquarius";

                    }else{

                        sign = "Pisces";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 3){

                if(day >= 1 && day <= 31){

                    if(day < 21){

                        sign = "Pisces";

                    }else{

                        sign = "Aries";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 4){

                if(day >= 1 && day <= 30){

                    if(day < 21){

                        sign = "Aries";

                    }else{

                        sign = "Taurus";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 5){

                if(day >= 1 && day <= 31){

                    if(day < 22){

                        sign = "Taurus";

                    }else{

                        sign = "Gemini";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 6){

                if(day >= 1 && day <= 30){

                    if(day < 23){

                        sign = "Gemini";

                    }else{

                        sign = "Cancer";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 7){

                if(day >= 1 && day <= 31){

                    if(day < 23){

                        sign = "Cancer";

                    }else{

                        sign = "Leo";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 8){

                if(day >= 1 && day <= 31){

                    if(day < 23){

                        sign = "Leo";

                    }else{

                        sign = "Virgo";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 9){

                if(day >= 1 && day <= 30){

                    if(day < 23){

                        sign = "Virgo";

                    }else{

                        sign = "Scales";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 10){

                if(day >= 1 && day <= 31){

                    if(day < 23){

                        sign = "Scales";

                    }else{

                        sign = "Scorpio";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 11){

                if(day >= 1 && day <= 30){

                    if(day < 22){

                        sign = "Scorpio";

                    }else{

                        sign = "Sagittarius";

                    }

                }else{

                    isError = true;

                }

            }

            if(month == 12){

                if(day >= 1 && day <= 31){

                    if(day < 22){

                        sign = "Sagittarius";

                    }else{

                        sign = "Capricorn";

                    }

                }else{

                    isError = true;

                }

            }
        }else{

            isError = true;

        }
        if(isError){

            System.out.println("You entered the wrong day/month.");

        }else {

            System.out.println("Your Zodiac Sign : " + sign);

        }
    }
}
```

```bash

        Month of birth : 1
        Day of birth : 21
        Your Zodiac Sign : Capricorn

```
```bash

        Month of birth : 2
        Day of birth : 19
        Your Zodiac Sign : Aquarius

```
```bash

        Month of birth : 3
        Day of birth : 20
        Your Zodiac Sign : Pisces

```
```bash

        Month of birth : 4
        Day of birth : 20
        Your Zodiac Sign : Aries

```
```bash

        Month of birth : 5
        Day of birth : 21
        Your Zodiac Sign : Taurus

```
```bash

        Month of birth : 6
        Day of birth : 22
        Your Zodiac Sign : Gemini

```
```bash

        Month of birth : 7
        Day of birth : 22
        Your Zodiac Sign : Cancer

```
```bash

        Month of birth : 8
        Day of birth : 22
        Your Zodiac Sign : Leo

```
```bash

        Month of birth : 9
        Day of birth : 22
        Your Zodiac Sign : Virgo

```
```bash

        Month of birth : 10
        Day of birth : 22
        Your Zodiac Sign : Scales

```
```bash

        Month of birth : 11
        Day of birth : 20
        Your Zodiac Sign : Scorpio

```
```bash

        Month of birth : 12
        Day of birth : 21
        Your Zodiac Sign : Sagittarius

```
```bash

        Month of birth : 13
        Day of birth : 35
        You entered the wrong day/month.

```

<br />

# LINK

* Click here https://github.com/Fogo9/Horoscope.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
