package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
    public static void index() {
        render();
    }
    public static void test(){
        render();   
    }
    public static void viewMhs(){
        List daftar=Mahasiswa.findAll();
        render(daftar);
    }
    public static void baruMhs(){
        render();
    }
    public static void simpanMhs(Mahasiswa mahasiswaku){
        mahasiswaku.save();
        viewMhs();
    }
    public static void editMhs(Long id){
        Mahasiswa z=Mahasiswa.findById(id);
        render(z);
    }
    public static void deleteMhs(Long id){
        Mahasiswa z=Mahasiswa.findById(id);
        z.delete();
        viewMhs();
    }
    public static void viewPeminjaman(){
        List daftar=Peminjaman.findAll();
        render(daftar);
    }
    public static void baruPmj(){
        render();
    }
    public static void simpanPmj(Peminjaman peminjamanmu){
        peminjamanmu.save();
        viewPeminjaman();
    }
    public static void editPmj(Long id){
        Peminjaman z=Peminjaman.findById(id);
        render(z);
    }
    public static void deletePmj(Long id){
        Peminjaman z=Peminjaman.findById(id);
        z.delete();
        viewPeminjaman();
    }
}