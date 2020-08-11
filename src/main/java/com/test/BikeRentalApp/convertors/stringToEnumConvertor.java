/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.convertors;

import com.test.BikeRentalApp.beans.Gender;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
public class stringToEnumConvertor implements Converter<String, Gender>{

    @Override
    public Gender convert(String s) {
        if(s.equals("Male")){
            return Gender.MALE;
        } else if(s.equals("Female")) {
            return Gender.FEMALE;
        } else {
            return Gender.OTHER;
        }
    }
    
}
