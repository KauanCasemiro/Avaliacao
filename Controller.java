//Agora, você pode criar um controlador que usa o NameService para obter dados do outro microserviço:


@RestController
class WebController {

    private final NameService nameService;

    public WebController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/get-name")
    public String getName() {
        return nameService.getName();
    }
}