/* alain created on 21/02/2021 */

package guru.springframework.jokes.controllers;

import guru.springframework.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;
    public String joke;
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/joke")
    public String getJoke(Model model) {
        this.joke =  jokeService.getJoke();
        model.addAttribute("joke",joke);
        return "joke";
    }
}
