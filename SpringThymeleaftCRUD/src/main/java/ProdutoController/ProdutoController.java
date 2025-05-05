package ProdutoController;

import gabriel.springthymeleaftcrud.model.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public String novoForm(Model model) {
        model.addAttribute("produto", new Produto()); // Envia um objeto vazio para o formulário
        return "form";
    }



    @PostMapping
    public @ResponseBody String salvar(@ModelAttribute Produto produto) {
        return "Produto salvo com sucesso!";

    public String listar(Model Object model;
        model){
        model.addAtribuite("produtos", produtoRepository.findAll());
        return "listar";

        }
    }
}
