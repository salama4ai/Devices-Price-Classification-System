package Devices.SpringBoot.entities.devices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AddNewDeviceData {
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

}
