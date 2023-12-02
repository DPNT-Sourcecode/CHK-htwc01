package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.Arrays;
import java.util.List;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        if(skus == null || skus.isBlank()){
            return -1;
        }

        List<String> items = Arrays.asList(skus.split(", "));
        int sum[] = {0};

        items.forEach(item -> {
            if("A".equals(item)){
                
            }
        });

    }
}


