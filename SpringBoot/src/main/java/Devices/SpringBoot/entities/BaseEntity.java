package Devices.SpringBoot.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public class BaseEntity {
    @Id
    @NotNull(message="id may not be null")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int _id;
    public int battery_power;
    public int blue;
    public float clock_speed;
    public int dual_sim;
    public int fc;
    public int four_g;
    public int int_memory;
    public float m_dep;
    public int mobile_wt;
    public int n_cores;
    public int pc;
    public int px_height;
    public int px_width;
    public int ram;
    public int sc_h;
    public int sc_w;
    public int talk_time;
    public int three_g;
    public int touch_screen;
    public int wifi;
    public Integer z_price_range;
}
