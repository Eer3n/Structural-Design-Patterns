package Facade.Service;

import Facade.Entity.Product;
import Facade.Entity.User;
import Facade.Entity.WishList;

import java.util.ArrayList;
import java.util.List;

public class UserService {


    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }


  /*  public User maskUserMailAddress(User user)
    {

        String mailAddress = user.getMailAddress();
        if (user != null){
            WishList wishList = new WishList();
            String maskedMailAddress = mailAddress.replaceAll("(^[^@]{3}|(?!^)\\G)[^@]", "$1*");
            if (mailAddress != maskedMailAddress) {
                return wishList;
            }



        }




        return user;*/



    /*public User maskUSerMailAddress(User user) {
        /**
         * elif.eren@gmail.com -> e....e...@gmail.com
         *
        //logic buraya kurulmalı!!!
        return user;
    }
    */
    //User in mail adresinin maskelenmis olup omadigini kontrol etmen lazim
    // Ex. elif.eren@gmail.com ise e***.e***@gmail.com olmasi gerekiyor
    //Bunun icin user Servicede bir maskeleme methodu yazilmasi lazi. +
    //Bu method gelen userin mail adresini alip istenilen formata dondurmesi gerekiyor +
    //wish list by user de gelen malil adresi maskeli mi kontrol ediliyor
    //Maskeli degilse null maskeliyse whishlisti donucem;
}


