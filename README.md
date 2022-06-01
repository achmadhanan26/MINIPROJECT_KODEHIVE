# MINIPROJECT_KODEHIVE
Berikut ini merupakan dokumentasi source code dari Miniproject Bootcamp Software Developer yang diselenggarakan oleh KODEHIVE. 

Miniproject ini menggunakan framework Spring boot dengan jdbc untuk membuat suatu database yang berisi kumpulan LinkedIn profile, dimana secara keselurahan data terdiri dari :
1. Nomor profile
2. Nama Lengkap
3. Tahun kelulusan
4. Jenis Kelamin
5. Nomor Telefon
6. Skill bahasa pemrogaman

Project Springboot pada git ini diinisialisasi dengan nama "javawithapiQuiz" kemudian, dalam pengerjaan miniproject ini menggunakan konsep alur database yang dibagi kedalam kumpulan packages sebagai berikut:

1. com.javawithapiquiz.controllers 
2. com.javawithapiquiz.Models
3. com.javawithapiquiz.Models.Repositorys
4. com.javawithapiquiz.Services

1. com.javawithapiquiz.controllers merupakan package utama pada project spring boot. controller ini berfungsi untuk menangkap input dari web berupa json command dan berisikan syntax untuk mengolah data yang didapat dari json tersebut, seperti menyimpan data, memanggil data, menghapus data, dll. package controller ini terhubung ke package .services dan memanggil object dari package models
2. com.javawithapiquiz.Models merupakan package yang berfungsi untuk  mendeklarasi table penyimpanan database yang disambungkan ke MySQL. selain itu, package Model ini juga berisi kumpulan inisialiasi kolom yang dikoding menggunakan syntax POJO atau plain old java object.
3. com.javawithapiquiz.Services merupakan package yang berfungsi untuk menghubungkan package controller dengan package repository. package service pada umumnya memang berisikan syntax syntax tertentu yang digunakan untuk menerpakan logika dan semacamnya.
4. com.javawithapiquiz.Repositorys merupakan package yang berisikan syntax mysql dan berfungsi untuk mengeksekusi suatu query database. package ini menghubungkan framework spring boot dengan Mysql database.

