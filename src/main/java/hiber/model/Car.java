package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;
    @Column(name="model")
    String model;
    @Column(name="series")
    int series;
    @OneToOne
    @JoinColumn
    private User user;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setCar_id(Long carId) {
        this.car_id = carId;
    }

    public Long getCar_id() {
        return car_id;
    }
}
