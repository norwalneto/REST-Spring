# REST-Spring
 Projeto API Banco

# Diagrama de Classes
 ```mermaid
classDiagram
    class User {
        +string name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }
    
    class Account {
        +string number
        +string agency
        +float balancy
        +float limit
    }
    
    class Feature {
        +string icon
        +string description
    }
    
    class Card {
        +string number
        +float limit
    }
    
    class News {
        +string icon
        +string description
    }
    
    User "1" *--> "1" Account : account
    User "1" *--> "N" Feature : features
    User "1" *--> "1" Card : card
    User "1" *--> "N" News : news
```
