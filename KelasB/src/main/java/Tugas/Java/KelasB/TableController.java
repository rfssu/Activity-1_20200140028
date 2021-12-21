/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.Java.KelasB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Rafi Saifullah Satria Utama
 */
@Controller
public class TableController {
    
    @RequestMapping("/dataktp")
  
    public String getTable(Model Data){
       
       ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        data.add(Arrays.asList("202001","123123","Rafi","Yogyakarta"));
        data.add(Arrays.asList("202002","125534","Saifullah","Yogyakarta"));
        data.add(Arrays.asList("202003","148294","Satria","Yogyakarta"));
        data.add(Arrays.asList("202004","141802","Utama","Yogyakarta"));
        data.add(Arrays.asList("202005","124858","Eky","Palu"));
        data.add(Arrays.asList("202006","139349","Andre","Berau"));
        data.add(Arrays.asList("202007","193129","Barik","Manchester"));
        data.add(Arrays.asList("202008","123040","Fayyad","Tottenham"));
        data.add(Arrays.asList("202009","051083","irsyad","Padang"));
        data.add(Arrays.asList("202010","174833","Ican","Cilegon"));
        data.add(Arrays.asList("202011","126784","Abid","Jambi"));
        data.add(Arrays.asList("202012","839939","Jordy","Jambi"));
        data.add(Arrays.asList("202013","138383","Asra","Jambi"));
        data.add(Arrays.asList("202014","168302","David","Banyuwangi"));
        data.add(Arrays.asList("202015","377263","Fatika","Yogyakarta"));
        data.add(Arrays.asList("202016","827393","Lala","Padang"));
        data.add(Arrays.asList("202017","338949","Yoga","Yogyakarta"));
        data.add(Arrays.asList("202018","203844","Asep","Banten"));
        data.add(Arrays.asList("202019","268903","Dimas","Bekasi"));
        data.add(Arrays.asList("202020","294940","Cindy","Jakarta"));
        
        
        
        Data.addAttribute("tabel", data);
        
        return "tableviewer"; 
    }
    
}
