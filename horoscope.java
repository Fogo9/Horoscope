import java.util.Scanner;

public class horoscope{
    public static void main(String[] args) {

        int month, day;

        String sign = "";

        boolean isError = false;


        Scanner input = new Scanner(System.in);


        System.out.print("Month of birth : ");

        month = input.nextInt();

        System.out.print("Day of birth : ");

        day = input.nextInt();



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
