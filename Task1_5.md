
# Task 1.
### Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными (заполнив файл лошадьми, верблюдами и ослами), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
---
    cat домашние_животные

Собака  
Кошка  
Хомяк

    cat > Вьючные_животные

Лошадь  
Верблюд  
Осел

    cat Домашние_животные Вьючные_животные > Животные  
    cat Животные  
    mv Животные Друзья_человека

# Task 2. 
### Создать директорию, переместить файл туда.
---
    mkdir animals  
    mv Друзья_человека /animals  
    cd animals  
    ls

---
# Task 3.
### Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
---
    sudo apt install mysql-server mysql-client  
    sudo apt-get update

# Task 4. 
### Установить и удалить deb-пакет с помощью dpkg.
---
Установка

    wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb
    sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb
    sudo apt install mysql-server
    sudo mysql_secure_installation
    sudo mysql_secure_installation
    sudo apt-get install mysql-workbench-community

Удаление

    sudo dpkg -s mysql-server
    sudo dpkg -r mysql-workbench-community
    sudo dpkg -r mysql-community-server

# Task 5. 
### Выложить историю команд в терминале ubuntu.
---
