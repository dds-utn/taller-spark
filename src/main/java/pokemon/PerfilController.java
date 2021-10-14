package pokemon;

import pokemon.repositories.UsuarioRepositorio;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class PerfilController {
    public ModelAndView index(Request request, Response response) {
        return new ModelAndView(UsuarioRepositorio.get().findAny(), "perfil.hbs");
    }
}
