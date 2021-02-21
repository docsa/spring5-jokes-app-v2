package guru.springframework.jokes.services;

/* alain created on 21/02/2021 */

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service("joke")
public class JokeService {

    ChuckNorrisQuotes chuckNorris;

    public JokeService() {
        this.chuckNorris = new ChuckNorrisQuotes();
    }

    public String getJoke() {
        return this.chuckNorris.getRandomQuote();
    }

}
