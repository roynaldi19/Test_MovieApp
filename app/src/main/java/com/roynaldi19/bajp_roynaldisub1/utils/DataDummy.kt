package com.roynaldi19.bajp_roynaldisub1.utils

import com.roynaldi19.bajp_roynaldisub1.R
import com.roynaldi19.bajp_roynaldisub1.data.DataEntity
import java.util.*

object DataDummy {

    fun generateDummyMovie(): List<DataEntity> {

        val movies = ArrayList<DataEntity>()

        movies.add(
                DataEntity("m01",
                        "A Star Is Born (2018)",
                        "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                        R.drawable.poster_a_start_is_born
                )
        )
        movies.add(
                DataEntity("m02",
                        "Bohemian Rhapsody (2018)",
                        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                        R.drawable.poster_bohemian
                )
        )
        movies.add(
                DataEntity("m03",
                        "Cold Pursuit (2019)",
                        "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                        R.drawable.poster_cold_persuit
                )
        )
        movies.add(
                DataEntity("m04",
                        "Creed II (2018)",
                        "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                        R.drawable.poster_creed
                )
        )
        movies.add(
                DataEntity("m05",
                        "How to Train Your Dragon: The Hidden World (2019)",
                        "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                        R.drawable.poster_how_to_train
                )
        )
        movies.add(
                DataEntity("m06",
                        "Avengers: Infinity War (2018)",
                        "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                        R.drawable.poster_infinity_war
                )
        )
        movies.add(
                DataEntity("m07",
                        "Master Z: Ip Man Legacy (2018)",
                        "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                        R.drawable.poster_master_z
                )
        )
        movies.add(
                DataEntity("m08",
                        "Wreck-It Ralph (2012)",
                        "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                        R.drawable.poster_ralph
                )
        )
        movies.add(
                DataEntity("m09",
                        "Robin Hood (2018)",
                        "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                        R.drawable.poster_robin_hood
                )
        )
        movies.add(
                DataEntity("m10",
                        "Spider-Man: Into the Spider-Verse",
                        "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                        R.drawable.poster_spiderman
                )
        )

        return movies
    }

    fun generateDummyTVShow(): List<DataEntity> {

        val tvshows = ArrayList<DataEntity>()

        tvshows.add(
                DataEntity("tv01",
                        "Dragon Ball (1986)",
                        "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                        R.drawable.tvposter_dragon_ball
                )
        )
        tvshows.add(
                DataEntity("tv02",
                        "Fairy Tail: Dragon Cry (2017)",
                        "Natsu Dragneel and his friends travel to the island Kingdom of Stella, where they will reveal dark secrets, fight the new enemies and once again save the world from destruction.",
                        R.drawable.tvposter_fairytail
                )
        )
        tvshows.add(
                DataEntity("tv03",
                        "Family Guy (1999)",
                        "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                        R.drawable.tvposter_family_guy
                )
        )
        tvshows.add(
                DataEntity("tv04",
                        "The Flash (2014)",
                        "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        R.drawable.tvposter_flash
                )
        )
        tvshows.add(
                DataEntity("tv05",
                        "Gotham (2014)",
                        "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                        R.drawable.tvposter_gotham
                )
        )
        tvshows.add(
                DataEntity("tv06",
                        "Hanna (2019)",
                        "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                        R.drawable.tvposter_hanna
                )
        )
        tvshows.add(
                DataEntity("tv07",
                        "Naruto Shippūden (2007)",
                        "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                        R.drawable.tvposter_naruto_shipudden
                )
        )
        tvshows.add(
                DataEntity("tv08",
                        "Supergirl (2015)",
                        "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                        R.drawable.tvposter_supergirl
                )
        )
        tvshows.add(
                DataEntity("tv09",
                        "The Simpsons (1989)",
                        "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                        R.drawable.tvposter_the_simpson
                )
        )
        tvshows.add(
                DataEntity("tv10",
                        "The Walking Dead (2010)",
                        "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        R.drawable.tvposter_the_walking_dead
                )
        )

        return tvshows
    }

}