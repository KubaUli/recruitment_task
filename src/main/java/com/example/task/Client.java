package com.example.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @NotNull
    String nick;
    @NotNull
    String login;
    @NotNull
    String password;
    @NotNull
    LocalDateTime insert_time;
/*    @OneToMany(mappedBy = "User")
    private List<Vehicle> vehicles = new ArrayList<>();
    @OneToMany(mappedBy = "User")
    private List<InsuranceOffers> insuranceOfferts = new ArrayList<>();*/

    public Client(String nick, String login, String password) {
        this.nick = nick;
        this.login = login;
        this.password = password;
        this.insert_time = LocalDateTime.now();
    }

    public Client() {}

/*    public void addVehicle(Vehicle vehicle){
vehicles.add(vehicle);
    }
    public void addInsuranceOfferts(InsuranceOffers insuranceOffert){
        insuranceOfferts.add(insuranceOffer);
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(LocalDateTime insert_time) {
        this.insert_time = insert_time;
    }

    @Override
    public String toString() {
        return "użytkownik{" +"id=" + id +", nick='" + nick + ", login='" + login + ", hasło='" + password +
                ", Godzina utworzenia=" + insert_time + '}';
    }
}
