package com.androidacok.recylerviewkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
        Superhero(
            R.drawable.avenger,
            "Avengers Infinity War",
            "Avengers: Infinity War adalah film pahlawan super Amerika 2018 yang didasarkan pada tim superhero Marvel Comics the Avengers, diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Ini adalah sekuel The Avengers 2012 dan Avengers: Age of Ultron 2015, dan film kesembilan belas di Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo, ditulis oleh Christopher Markus dan Stephen McFeely, dan menampilkan pemeran ansambel termasuk Robert Downey Jr, Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Benedict Cumberbatch, Don Cheadle, Tom Holland, Chadwick Boseman, Paul Bettany, Elizabeth Olsen, Anthony Mackie, Sebastian Stan, Danai Gurira, Letitia Wright, Dave Bautista, Zoe Saldana, Josh Brolin, dan Chris Pratt. Dalam film tersebut, Avengers dan Guardians of the Galaxy berupaya mencegah Thanos dari mengumpulkan enam Batu Infinity yang sangat kuat sebagai bagian dari upayanya untuk membunuh setengah dari seluruh kehidupan di alam semesta."
            ),
        Superhero(
            R.drawable.doctor,
            "Doctor Strange",
            "Doctor Strange adalah sebuah film pahlawan super Amerika yang menampilkan karakter Marvel Comics dengan nama yang sama, diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Motion Pictures. Film ini merupakan film keempat belas dari Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Scott Derickson, yang menulis skenario adalah C. Robert Cargill dari sebuah cerita oleh duo dan Jon Spahits, dan dibintangi oleh Benedict Cumberbatch, Chiwetel Ejiofor, Rachel McAdams, Benedict Wong, Michael Stuhlbarg, Benjamin Bratt, Scott Adkins, Mads Mikkelsen, dan Tilda Swinton. Dalam Doctor Strange, ahli bedah Stephen Strange belajar seni mistik dari Ancient One setelah kecelakaan mobil mengakhiri kariernya."
            ),
        Superhero(
            R.drawable.spider,
            "Spider-Man Homecoming",
            "Spider-Man: Homecoming adalah film superhero Amerika 2017 berdasarkan karakter Marvel Comics Spider-Man, diproduksi bersama oleh Columbia Pictures dan Marvel Studios, dan didistribusikan oleh Sony Pictures Releasing. Ini adalah reboot film Spider-Man kedua dan film keenam belas di Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Jon Watts, dari sebuah skenario oleh tim penulis Jonathan Goldstein dan John Francis Daley, Watts dan Christopher Ford, dan Chris McKenna dan Erik Sommers. Tom Holland berperan sebagai Peter Parker / Spider-Man, bersama Michael Keaton, Jon Favreau, Zendaya, Donald Glover, Tyne Daly, Marisa Tomei, dan Robert Downey Jr. Dalam Spider-Man: Homecoming, Peter Parker mencoba menyeimbangkan kehidupan sekolah menengah dengan menjadi Spider-Man saat menghadapi Vulture"
        ),
        Superhero(
            R.drawable.jujutsukaisen,
            "Jujutsu Kaisen 0",
            "Jujutsu Kaisen 0 adalah seri manga Jepang yang ditulis dan diilustrasikan oleh Gege Akutami. Awalnya berjudul Tokyo Metropolitan Curse Technical School, diserialkan di majalah Jump GIGA Shueisha dari April hingga Juli 2017. Setelah Akutami meluncurkan Jujutsu Kaisen pada tahun 2018, seri ini secara surut diberi judul Jujutsu Kaisen 0, menjadikannya prekuel, dan dirilis dalam satu volume tankōbon pada Desember 2018. Dilisensikan untuk rilis bahasa Inggris di Amerika Utara oleh Viz Media. Serial ini mengikuti siswa muda Yuta Okkotsu yang menjadi penyihir untuk mengendalikan Roh Terkutuklah teman masa kecilnya Rika Orimoto."
        ),
        Superhero(
            R.drawable.thorkedua,
            "Thor The Dark World",
            "Thor: The Dark World adalah sebuah film pahlawan super Amerika 2013 yang menampilkan karakter Marvel Comics Thor, yang diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Film tersebut adalah sekuel dari Thor pada 2011 dan film kedelapan pada Marvel Cinematic Universe. Film tersebut disutradarai oleh Alan Taylor, dengan permainan latar oleh Christopher Yost, Christopher Markus dan Stephen McFeely.[3] Film tersebut dibintangi oleh Chris Hemsworth, Natalie Portman, Tom Hiddleston, Anthony Hopkins, Stellan Skarsgård, Idris Elba, Christopher Eccleston, Adewale Akinnuoye-Agbaje, Kat Dennings, Ray Stevenson, Zachary Levi, Tadanobu Asano, Jaimie Alexander, dan Rene Russo."
        ),
        Superhero(
            R.drawable.captamerika,
            "Captain America The Winter Soldier",
            "Captain America: The Winter Soldier adalah film pahlawan super asal Amerika dari terbitan Marvel Comics dalam komik Captain America, yang diproduseri Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Yang merupakan sekuel dari film pada tahun 2011 Captain America: The First Avenger dan film kesembilan dari Marvel Cinematic Universe (MCU). Disutradari oleh Anthony and Joe Russo, yang ditulis oleh Christopher Markus and Stephen McFeely, dibintangi oleh Chris Evans, Scarlett Johansson, Robert Redford dan Samuel L. Jackson. Dalam Captain America: The Winter Soldier, Captain America dan Black Widow bersatu untuk menghentikan musuh dalam selimut yang bersembunyi di Washington DC. Captain America: The Winter Soldier di jadwalkan untuk dirilis pada 2 April 2014 untuk Indonesia dan 4 April 2014 untuk Amerika Serikat."
        ),
        Superhero(
            R.drawable.sanci,
            "Shang-Chi and the Legend of the Ten Rings",
            "Shang-Chi and the Legend of the Ten Rings adalah sebuah film pahlawan super Amerika Serikat yang berdasarkan pada karakter Marvel Comics Shang-Chi. Diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures, film tersebut ditujukan untuk menjadi film kedua puluh delapan dari Marvel Cinematic Universe (MCU). Film tersebut disutradarai oleh Destin Daniel Cretton dari skenario karya David Callaham dan dibintangi oleh Simu Liu, Awkwafina, Tony Leung, Michelle Yeoh, Fala Chen, Meng'er Zhang, Florian Munteanu dan Ronny Chieng."
        ),
        Superhero(
            R.drawable.captmarvel,
            "Captain Marvel",
            "Captain Marvel adalah film superhero Amerika Serikat tahun 2019 yang disutradarai oleh Anna Boden dan Ryan Fleck dan diproduseri oleh Kevin Feige. Ini adalah film kedua puluh satu dari seri Marvel Cinematic Universe. Naskah film ini ditulis oleh Anna Boden, Lili Qadriana, Ryan Fleck, Geneva Robertson-Dworet dan Jac Schaeffer, sementara ceritanya ditulis oleh Nicole Perlman, Joe Schrapnel dan Anna Waterhouse berdasarkan komik Carol Danvers karya Roy Thomas dan Gene Colan. Film ini dibintangi oleh Brie Larson, Samuel L. Jackson, Ben Mendelsohn, Djimon Hounsou, Lee Pace, Lashana Lynch, Gemma Chan, Annette Bening, Clark Gregg dan Jude Law."
        ),
        Superhero(
            R.drawable.ironmanketiga,
            "Iron Man 3",
            "Iron Man 3 adalah film pahlawan super Amerika Serikat tahun 2013 yang menampilkan karakter Marvel Comics, Iron Man. Film ini diproduksi Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures.[N 1] Ini adalah sekuel dari Iron Man dan Iron Man 2, sekaligus seri ketujuh di Marvel Cinematic Universe, dan menjadi film besar pertama sejak The Avengers. Shane Black menyutradarai naskah yang ia tulis bersama Drew Pearce yang diadaptasi dari cerita \"Extremis\" karya Warren Ellis. Jon Favreau, sutradara dua film pertama, menjadi produser eksekutif bersama Kevin Feige untuk film ini.[6] Robert Downey, Jr. kembali tampil sebagai pemeran utama. Gwyneth Paltrow, Don Cheadle, dan Favreau juga berperan kembali sebagai Pepper Potts, James Rhodes, dan Happy Hogan. Guy Pearce, Rebecca Hall, Stephanie Szostak, James Badge Dale, dan Ben Kingsley menjadi pelengkap tokoh utama dalam film ini."
        ),
         Superhero(
            R.drawable.civilwar,
             "Captain America Civil War",
             "Captain America: Civil War merupakan sebuah film pahlawan super Amerika Serikat yang dirilis pada tahun 2016. Ini adalah film ketiga belas di Marvel Cinematic Universe. Captain America: Civil War merupakan sequel dari Captain America: The First Avenger pada tahun 2011 dan Captain America: The Winter Soldier pada tahun 2014. Film ini tayang di bioskop tanggal 6 Mei 2016 dalam versi 3D dan IMAX."
         ),
         Superhero(
             R.drawable.wandavision,
             "Wanda Vision",
             "WandaVision adalah miniseri televisi web untuk Disney+ oleh Jac Schaeffer, berdasarkan karakter Marvel Comics Wanda Maximoff/Scarlet Witch dan Vision. Mengambil tempat dalam Marvel Cinematic Universe dan berbagi kontinuitas dengan film-film didalamnya, film ini akan berlatar waktu setelah Avengers: Endgame. Serial ini diproduksi oleh Marvel Studios, dengan Schaeffer sebagai penulis kepala dan Matt Shakman sebagai sutradara."
         ),
         Superhero(
             R.drawable.doctormom,
             "Doctor Strange in the Multiverse of Madness",
             "Doctor Strange in the Multiverse of Madness adalah film superhero Amerika yang akan datang berdasarkan karakter Marvel Comics Doctor Strange. Diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures, film ini dimaksudkan untuk menjadi sekuel Doctor Strange (2016) dan film ke-28 dari Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Sam Raimi dari naskah yang ditulis oleh Michael Waldron, dan dibintangi oleh Benedict Cumberbatch sebagai Stephen Strange, bersama Elizabeth Olsen, Chiwetel Ejiofor, Benedict Wong, Xochitl Gomez, Michael Stuhlbarg, dan Rachel McAdams. Dalam film tersebut, Strange dan sekutunya melakukan perjalanan ke multiverse untuk menghadapi musuh baru yang misterius."
         ),
         Superhero(
            R.drawable.eternal,
            "Eternals",
             "Eternals adalah film pahlawan super Amerika Serikat tahun 2021 yang didasarkan dari karakter Marvel Comics bernama sama. Film ini diproduksi Marvel Studios dan disalurkan Walt Disney Studios Motion Pictures. Film ini adalah film ke-26 Marvel Cinematic Universe (MCU). Film ini disutradarai Chloé Zhao, ditulis Matthew dan Ryan Firpo, serta dibintangi kelompok pemeran yang terdiri dari Gemma Chan, Angelina Jolie, Richard Madden, Kumail Nanjiani, Lauren Ridloff, Brian Tyree Henry, Salma Hayek, Lia McHugh, dan Ma Dong-seok. Eternals dijadwalkan akan ditayangkan di Amerika Serikat pada 5 November 2021."
         ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_heru)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter (this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

            }

    }
}
