package edu.miu.cs.cs425.seniorproject.hotelguestmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roomtypes")
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomtype_id")
    private Long roomTypeId;
    @Column(updatable = false, nullable = false)
    private String type;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = true)
    private String description;
    @Column(nullable = true)
    private String imagePath;
    private Integer numberOfRoomsAvailable;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "room_id")
    private List<Room> roomList;

    public void addRoom(Room room) {
        roomList.add(room);
    }
}
