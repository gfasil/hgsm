package edu.miu.cs.cs425.seniorproject.hotelguestmanagementsystem.controller;

import edu.miu.cs.cs425.seniorproject.hotelguestmanagementsystem.model.RoomType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoomController {

    @GetMapping("/room")
    public String getRooms(Model model) {

        RoomType[] roomArr = { new RoomType(1l, "Standard", 100.00, "this is kings description", "img/banner.jpg"),
                new RoomType(1l, "Deluxe", 200.00, "this is kings description", "img/banner.jpg"),
                new RoomType(1l, "Superior Deluxe", 300.00, "this is kings description", "img/banner.jpg"),
                new RoomType(1l, "Premier Deluxe", 400.00, "this is kings description", "img/banner.jpg"),
                new RoomType(1l, "Executive Suite", 500.00, "this is kings description", "img/banner.jpg"),
                new RoomType(1l, "Junior Suite", 600.00, "this is kings description", "img/banner.jpg") };

        model.addAttribute("typesOfRooms",roomArr);
        return "accommodation";
    }
}


