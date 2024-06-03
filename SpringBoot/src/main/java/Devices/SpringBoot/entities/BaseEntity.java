package Devices.SpringBoot.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import static com.sun.imageio.plugins.jpeg.JPEG.version;

@MappedSuperclass
public class BaseEntity {
    @Id
    @NotNull(message="id may not be null")
    @NotBlank(message="id may not be blank")
    public int id;
    private int battery_power;
    private int blue;
    private float clock_speed;
    private int dual_sim;
    private int fc;
    private int four_g;
    private int int_memory;
    private float m_dep;
    private int mobile_wt;
    private int n_cores;
    private int pc;
    private int px_height;
    private int px_width;
    private int ram;
    private int sc_h;
    private int sc_w;
    private int talk_time;
    private int three_g;
    private int touch_screen;
    private int wifi;
    public Integer price_range;
    public String getVersion() {
        return version;
    };
}
