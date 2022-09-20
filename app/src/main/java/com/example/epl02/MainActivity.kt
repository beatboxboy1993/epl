package com.example.epl02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity(), TileInterface {

    lateinit var characterTileList: ArrayList<CharacterTile>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        characterTileList = getTheCharacterTiles()

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragmentContainerView, ListFragment())
        }
    }

    private fun getTheCharacterTiles(): ArrayList<CharacterTile> {
        return ArrayList<CharacterTile>().apply {
            add(
                CharacterTile(
                    id="saul",
                    R.drawable.saul,
                    "Jimmy McGill",
                    "James Morgan \"Jimmy\" McGill, better known by his professional alias and business moniker Saul Goodman, is an Irish-American criminal defence lawyer and scam artist",
                    "James Morgan \"Jimmy\" McGill, better known by his professional alias and business moniker Saul Goodman, is an Irish-American criminal defence lawyer, scam artist, and convicted criminal who is serving an 86-year sentence at ADX Montrose. Originally from Cicero, Illinois during his career as a scam artist, Jimmy moved to Albuquerque, New Mexico where he worked as a lawyer, and later resided as a fugitive in Omaha, Nebraska before being caught and apprehended in a federal prison at Montrose, Colorado. During his law career, Jimmy embraced his tendencies as a former scam artist and, after becoming a dedicated and effective criminal lawyer, he began to represent criminals while he himself became increasingly involved in the city's criminal underworld, slowly losing his morality along the way. Despite his flamboyant appearance and mannerisms, Saul was a highly competent lawyer who was able to solve problems and find loopholes in order to protect his clients. His business name, \"Saul Goodman,\" is a play on the phrase \"it's all good, man.\"",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("saul")
                )
            )
            add(
                CharacterTile(
                    id="kim",
                    R.drawable.kim,
                    "Kim Wexler",
                    "Kimberly \"Kim\" Wexler is an American business lawyer and public defender who worked in Albuquerque, New Mexico, currently residing in Titusville, Florida as an employee at a sprinkler manufacturer company and a volunteer at a pro bono legal services firm.",
                    "Kimberly \"Kim\" Wexler is an American retired business lawyer and public defender who worked in Albuquerque, New Mexico, currently residing in Titusville, Florida as an employee at a sprinkler manufacturer company and a volunteer at a pro bono legal services firm. She is the ex-wife and former confidant of retired lawyer and convicted criminal Jimmy McGill, whom she met while working at Hamlin, Hamlin & McGill (HHM) as an intern, and had dated for several years before their six-month marriage. Despite retiring as a lawyer, Kim's New Mexico bar card does not have an expiration date, allowing her to visit Jimmy in prison as a lawyer.\n" +
                            "\n" +
                            "Throughout her law career, Kim received praise as a lawyer for being highly skilled at negotiation and devising legal strategies in order to get her clients the best deals possible, though she was sometimes undermined at HHM by Howard Hamlin and Chuck McGill, her former bosses at HHM. After leaving HHM, Kim became the head of Schweikart & Cokely's banking division and hired Kevin Wachtell and Paige Novick from Mesa Verde Bank and Trust as her clients, before quitting the firm and dropping Mesa Verde as a client to focus her attention on pro bono work. She and Jimmy also briefly worked at their own startup law firm Wexler McGill, which consisted of twin solo firms. Outside of the law, Kim had a few part-time jobs including working at Saul Goodman Productions, and also assisted Jimmy with various cons and schemes after being drawn in by Jimmy's cons.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("kim")
                )
            )
            add(
                CharacterTile(
                    id="michael",
                    R.drawable.micheal,
                    "Michael Ehrmantraut",
                    "Michael \"Mike\" Ehrmantraut is an American career criminal, Marine Corps veteran, and former Philadelphia police officer.",
                    "Michael \"Mike\" Ehrmantraut is an American career criminal, Marine Corps veteran, and former Philadelphia police officer. Calm and calculating, Mike later became a private investigator, hitman, assassin, and violent fixer for drug traffickers to financially support his family (his daughter-in-law Stacey and granddaughter Kaylee). He worked for both Gustavo Fring and Saul Goodman as a private investigator, head of security, cleaner, fixer, and hitman. Mike has extensive knowledge of how to operate on both sides of the law without detection. As a former beat cop and true professional, Mike maintains an extensive, up-to-date knowledge of forensic evidence, surveillance equipment, and police procedure. Mike is also well-trained and calm in all types of combat situations, once using science and long strategy to take down a large number of hostiles with ease.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("michael")
                )
            )
            add(
                CharacterTile(
                    id="chuck",
                    R.drawable.chuck,
                    "Chuck McGill",
                    "Charles Lindbergh \"Chuck\" McGill, Jr. is an Irish-American corporate lawyer from Albuquerque, New Mexico, and the co-founder and named partner of Hamlin, Hamlin & McGill (HHM), one of Albuquerque's most prestigious law firms.",
                    "Charles Lindbergh \"Chuck\" McGill, Jr. is an Irish-American corporate lawyer from Albuquerque, New Mexico, and the co-founder and named partner of Hamlin, Hamlin & McGill (HHM), one of Albuquerque's most prestigious law firms. He is the older brother of criminal defence lawyer and convicted criminal Jimmy McGill, and the ex-husband of Rebecca Bois.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("chuck")
                )
            )
            add(
                CharacterTile(
                    id="howard",
                    R.drawable.howard,
                    "Howard Hamlin",
                    "Howard G. Hamlin is an American corporate lawyer from Albuquerque, New Mexico, best known as the owner and CEO of Hamlin, Hamlin & McGill (HHM), a large and respected law firm that originally established by Howard's father George and Chuck McGill, who later added Howard as one of the managing partners.",
                    "Howard G. Hamlin is an American corporate lawyer from Albuquerque, New Mexico, best known as the owner and CEO of Hamlin, Hamlin & McGill (HHM), a large and respected law firm that originally established by Howard's father George and Chuck McGill, who later added Howard as one of the managing partners. When George died and Chuck became housebound as a result of his supposed electromagnetic hypersensitivity (EHS), Howard became the firm's managing partner and senior partner. Howard's friendship with Chuck and privileged background prove to be a constant source of frustration for both Jimmy McGill and Kim Wexler, his former employees at the firm. Despite his feuds with the McGill brothers and Kim, Howard is a skilled and affluent lawyer, with HHM being one of the most respected firms in Albuquerque.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("howard")
                )
            )
            add(
                CharacterTile(
                    id="nacho",
                    R.drawable.nacho,
                    "Nacho Varga",
                    "Ignacio \"Nacho\" Varga is a Mexican-American career criminal from Albuquerque, New Mexico, and the son of Manuel Varga.",
                    "Ignacio \"Nacho\" Varga is a Mexican-American career criminal from Albuquerque, New Mexico, and the son of Manuel Varga. Calculating and intelligent, Nacho was formerly an employee at his father's shop A-Z Fine Upholstery before becoming affiliated with the Cartel. He became one of Tuco Salamanca's most trusted enforcers and later became the lieutenant of both Hector and Lalo Salamanca. Against his will, Nacho later became an informant to Gustavo Fring after being blackmailed by him. As his role in both the Cartel and Gus' drug operation began to amplify, Nacho became increasingly discouraged from the organizations as his affiliation with them put both his and his father's lives in danger.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("nacho")
                )
            )
            add(
                CharacterTile(
                    id="daniel",
                    R.drawable.daniel,
                    "Daniel Wormald",
                    "Daniel \"Danny\" Wormald, also known by his aliases Pryce and Danny, is a quirky, nerdy and naive man who works for a pharmaceutical company, who later became the owner of Lazer Base.",
                    "Daniel \"Danny\" Wormald, also known by his aliases Pryce and Danny, is a quirky, nerdy and naive man who works for a pharmaceutical company, who later became the owner of Lazer Base.[1] He is known for being comically naïve, unprepared for his interactions with career criminals, and completely oblivious to the nuances and subtleties of life outside of the law.\n" +
                            "\n" +
                            "To earn extra money, Daniel steals some of his company's pills to sell to Nacho Varga and hires Mike Ehrmantraut to provide security. Knowing that Nacho is going behind the cartel's back and wants to avoid attention, Mike assures that he abides by the terms of the deal. Daniel uses the money to buy a flashy Hummer and when he arranges another deal, Mike refuses to be a part of it. Daniel still meets Nacho, but without Mike to protect him, Nacho obtains Daniel's address. Nacho later breaks into Daniel's home to steal Daniel's cash, pill stash, and a collection of baseball cards. Daniel calls police to report the stolen cards but his awkward behavior leads the cops to find the hiding place where he kept the cash and pills. To keep Daniel from talking, Mike brokers a deal that has Nacho exchange cash and the baseball cards for Daniel's Hummer. Mike also arranges for Jimmy to represent Daniel during an interview with police, in which Jimmy allays their suspicions by claiming Daniel has a fetish for \"pie sitting\" and kept videos of the act in his hiding place.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("daniel")
                )
            )
            add(
                CharacterTile(
                    id="tuco",
                    R.drawable.tuco,
                    "Tuco Salamanca",
                    "Tuco Salamanca is a high-ranking distributor and drug kingpin from the Cartel.",
                    "Tuco Salamanca is a high-ranking distributor and drug kingpin from the Cartel. A member of the Salamanca family, Tuco is the grandson of Abuelita and the nephew of Hector. Tuco also has four cousins who are involved in criminal activities: Lalo, Marco, Leonel, and Joaquin. He is the first Salamanca family member to run their drug operation, and was succeeded by his uncle Hector and cousin Lalo. Tuco is known for his psychotic and unpredictable personality, being prone to violent outbursts which are often amplified by his drug use.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("tuco")
                )
            )
            add(
                CharacterTile(
                    id="betsy",
                    R.drawable.betsy,
                    "Betsy Kettleman",
                    "Elizabeth A. \"Betsy\" Kettleman is the wife of Craig Kettleman and the mother of Warren and Jo Jo Kettleman. ",
                    "Elizabeth A. \"Betsy\" Kettleman is the wife of Craig Kettleman and the mother of Warren and Jo Jo Kettleman. She has been helping her husband, who was a thieving treasurer, flee from his conviction at any cost for the sake of her family's financial health. Betsy and Craig currently own the company Sweet Liberty Tax Services.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("betsy")
                )
            )
            add(
                CharacterTile(
                    id= "kettleman",
                    0,
                    "Vollidioten",
                    "Wie deppat kamma eigentlich sein?",
                    "Deppater geht s sicher nicht. Sollte hier auch nicht beschrieben werden, was die gemacht haben, weils einfach nur ultra deppat war.",
                    "https://bettercallsaul.fandom.com/de/wiki/Better_Call_Saul_Wikia",
                    isFavorite = SharedPrefUtil.getListTileFavorite("kettleman")
                )
            )
        }
    }

    override fun onLearnMorButtonClicked(position: Int) {
        val characterTile = characterTileList[position]
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            addToBackStack(null)
            val bundle = Bundle().apply {
                putString("characterTileId", characterTile.id)
            }
            replace(R.id.fragmentContainerView, DetailFragment().apply {
                arguments = bundle
            })
        }
    }

    override fun onFavoriteClicked(position: Int) {
        val characterTile = characterTileList[position]
        characterTile.isFavorite = !characterTile.isFavorite

        (supportFragmentManager.fragments[0] as ListFragment).onClickedFavorite(position)

        SharedPrefUtil.setListTileFavorite(characterTile.id, characterTile.isFavorite)
    }

}