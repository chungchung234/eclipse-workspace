package com.chung.rrs.controller;


import java.io.IOException;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chung.rrs.dto.RestaurantDto;
import com.chung.rrs.service.serviceImpl.rreServiceImpl;
@RestController
public class rrsController {
    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        loop:while (true){
            System.out.println("____________________________________________________________");
            System.out.println("Menu\t\t\t\tDescription" +
                    "\n1.All_data\t\t\tAll Restaurant Info Sort By Rating" +
                    "\n2.Pick_Me_One\t\t\tPick Random Restaurant" +
                    "\n3.Management_data\t"+
                    "\n4.Exit");
            System.out.println("____________________________________________________________");
            System.out.print("Pick : ");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    rreServiceImpl.all_data();
                    break;
                case 2:
                	rreServiceImpl.pick_Me_One();
                    break;
                case 3:
                    loop2 : while (true) {
                        System.out.println("____________________________________________________________");
                        System.out.println("Management\t\t\tDescription" +
                                "\n1.Add\t\t\t\tAdd Your Favorite Restaurant" +
                                "\n2.Delete\t\t\tDelete Restaurant From Data" +
                                "\n3.Search\t\t\tSearch Restaurant Info To Name" +
                                "\n4.Modify\t\t\tModify Restaurant Info"+
                                "\n5.Go to Menu");
                        System.out.println("____________________________________________________________");
                        System.out.print("Pick : ");
                        int m = scanner.nextInt();
                        switch (m) {
                            case 1:
                            	rreServiceImpl.add();
                                break;
                            case 2:
                            	rreServiceImpl.delete();
                                break;
                            case 3:
                            	rreServiceImpl.search();
                                break;
                            case 4:
                            	rreServiceImpl.modify();
                                break;
                            case 5:
                                break loop2;
                        }
                    }
                    break ;
                case 4:
                    scanner.close();
                    System.out.println("Thank You~!");
                    break loop;
            }

        }
    }
}
