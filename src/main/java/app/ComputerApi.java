package app;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class ComputerApi {
    private List<Computer> computers;

    public ComputerApi() {
        Computer computer1 = new Computer(1, "DDR1", 1000, 110);
        Computer computer2 = new Computer(2, "DDR2", 1100, 215);

        computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
    }

    //Ten string podawant w PostMappingu powinien być wyniesiony do innej klasy i tak powinniśmy z niego korzystać
    @PostMapping("/api/computer/add")
    public void addComputer(@RequestBody Computer computer) {
        computers.add(computer);
    }

    @GetMapping("/api/computers")
    List<Computer> getComputers() {
        return computers;
    }

    @DeleteMapping("/api/computer/remove")
    public boolean removeComputer(@RequestParam long id) {
        Optional<Computer> firs = computers.stream().filter(x -> x.getId() == id).findFirst();
        if (firs.isPresent()) {
            return computers.remove(firs.get());
        }
        return false;

    }


}
