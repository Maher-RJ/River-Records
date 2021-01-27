## Task & Solution


### Task
<img width="413" alt="river records" src="https://user-images.githubusercontent.com/57875037/105995132-dd63a780-60a8-11eb-8a27-54288bfbcda5.png">
<img width="415" alt="river records2" src="https://user-images.githubusercontent.com/57875037/105995153-e5234c00-60a8-11eb-9887-958da98b0594.png">


### Solution

```java

public static int maxTrailing(List<Integer> levels) {

        int max = -1;
        for(int i = 1; i < levels.size(); i++) {

            for(int j = i - 1; j >= 0; j--) {

                int first = levels.get(i);
                int second = levels.get(j);
                int difference = first - second;
                if(difference > 0 && difference > max) {
                    max = difference;
                }
            }
        }
        
        return max;
    }

```
