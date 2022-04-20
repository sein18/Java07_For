# 제어문 (If,Switch,While,For)

---

* __조건문(if문, switch문)__: 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 조건에 따라 다른 문장이 수행되도록 한다.

  * ```java
    if(조건식){
        수행될 문장;
    } else if(조건식2){
        수행될 문장;
    } else{
        수행될 문장;
    }
    ```

  * ```java
    switch(num % 5){
        case 1:
            team = "1조";
            break;
        case 2:
            team = "2조";
            break;
        case 3:
            team = "3조";
            break;
        default:
            team = "다시";
    }
    ```

---

* __반복문(wihle문, do~while문, for문)__: 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 특정 문장들을 반복해서 수행하도록 한다.

  * ```java
    while(조건식){
        수행될 문장;
        [증감식 or 분기문];
    }
    ```

  * ```java
    do{
        수행될 문장;
        [중감식 or 분기물]
    }while(조건식);  //while문과 다르게 조건식에 만족하지 않아도 무조건 한번 do{ }사이가 실행된 후 while문을 실행한다.
    ```

  * ```java
    for(초기식;조건식;증감식){
        수행될 문장;
    }  //무한루프를 돌지 않도록 유의해야한다.
    
    //중첩 반복문
    for(초기식;조건식;증감식){
        수행될 문장;
        for(초기식;조건식;증감식){
        	수행될 문장;
    	} 
    }   
    ```

---

* __분기문__

  * __break__: 반복문에서는 break문 자신이 포함된 가장 가까운 반복문을 빠져나가는 구문이다.

  * ```java
    for(int i = 1;; i++) {
    	System.out.println(i + " 출력");
    	if(i >= 10) {
    		break;
    	}
    }
    ```

  * __countinue__: 반복문 내에서만 사용 가능하며 반복문 실행 시 continue 아래 부분은 실행하지 않고 반복문 다시 실행한다.  for문의 경우 증감식으로 이동, while(do~while)문의 경우 조건식으로 이동 전체 반복 중에 특정 조건을 만족하는 경우를 제외하고자 할 때 유용하다.

  * ```java
    for(int i = 1; i <= 10; i++) {
    	if(i % 2 == 0) {	
    		continue;
    	}
    	System.out.println(i + " 출력");
    }
    ```

