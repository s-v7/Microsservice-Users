 ### User-Microservices {#}
>
> ### System under development!  
>
>>
>> | Technologies Used | Description |
>> | ----------- | ----------- |
>> | Front-End | <<?????>> |
>> | Back-End  | Java 8+, ... |  
>> | ORM       | Hibernate, Jpa,.. |  
>> | SGBD(s)   | MySQL Driver, ... |
> 
>>
1. - In some terminal do a git clone in the repository  
>  
>
2. - Create a new database in some Terminal Ex: XAMPP Control
```
mysql>> mysql -u root -p // Ex: ...
mysql>> create database users // users foir o modelo utlizado no exemplo  
mysql>>create user 'springuserNameYour'@'%' identified by 'password';
msqy>>grant all on users.* to 'springuserNameYour'@'%';
```
3. - Once this is done and with XAMPP and sgbd running we can run it in the terminal or via preference.
>
>> ### Method/Routes
>> | Method | Description | Routes |
>> | ----------- | ----------- | ----------- |
>> | @GetMapping  | List all Objects | ("/usuarios") |
>> | @PostMapping | Create Objects   | ("/usuarios") |
>> | @GetMapping  | Search for an object | ("/usuarios/{id}") | 
>> | @PutMapping  | Update an Object |  ("/usuarios/{id}") |
>> | @DeleteMapping | Delete an Object | ("/usuariosq{id}") | 
>
4. - Object Parameters
```
{
    "id": Integer,
    "nome": 'String",
    "idade" Integer,
    "endereco": "String",
    "estado" "String",
    "pais": "String"
}
```
>
##### Author: Developer/Programmer Silas Vasconcelos Cruz:

