package com.TrabajoFinal_ADS2.controller;

import com.TrabajoFinal_ADS2.dto.PedidoDTO;
import com.TrabajoFinal_ADS2.modelo.*;
import com.TrabajoFinal_ADS2.repository.*;
import com.TrabajoFinal_ADS2.service.PedidoService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@Controller
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private VendedorRepository vendedorRepository;

    @Autowired
    private SupervisorDeVentaRepository supervisorDeVentaRepository;

    @Autowired
    private TipoVariedadRepository tipoVariedadRepository;

    @Autowired
    private PlantaRepository plantaRepository;

    @ModelAttribute("pedido")
    public PedidoDTO retornarNuevoPedidoDTO(){
        return new PedidoDTO();
    }

    @GetMapping("/home/editarPedido/{id}")
    public String editarPedido(@PathVariable("id") Long id, Model model) {
        // Obtiene el pedido a editar por ID
        Pedido pedido1 = pedidoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid pedido ID:" + id));
        List<Producto> productos = productoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        List<Vendedor> vendedores = vendedorRepository.findAll();
        List<SupervisorDeVenta> supervisorDeVentas = supervisorDeVentaRepository.findAll();
        List<TipoVariedad> tipoVariedades = tipoVariedadRepository.findAll();
        List<Planta> plantas = plantaRepository.findAll();
        model.addAttribute("pedido1",pedido1);
        model.addAttribute("productos", productos);
        model.addAttribute("clientes", clientes);
        model.addAttribute("vendedores", vendedores);
        model.addAttribute("supervisorDeVentas",supervisorDeVentas);
        model.addAttribute("tipoVariedades", tipoVariedades);
        model.addAttribute("plantas", plantas);
        return "editarPedido";
    }

    @PostMapping("/home/editarPedido/{id}")
    public String actualizarPedido(@PathVariable("id") Long id, @ModelAttribute("pedido") PedidoDTO pedidoDTO) {
        pedidoService.editarPedido1(id,pedidoDTO);
        return "redirect:/home/listarPedidos";
    }

    @GetMapping("/home/editarPedidoPendientes/{id}")
    public String editarPedidoPendientes(@PathVariable("id") Long id, Model model) {
        // Obtiene el pedido a editar por ID
        Pedido pedido1 = pedidoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid pedido ID:" + id));
        List<Producto> productos = productoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        List<Vendedor> vendedores = vendedorRepository.findAll();
        List<SupervisorDeVenta> supervisorDeVentas = supervisorDeVentaRepository.findAll();
        List<TipoVariedad> tipoVariedades = tipoVariedadRepository.findAll();
        List<Planta> plantas = plantaRepository.findAll();
        model.addAttribute("pedido1",pedido1);
        model.addAttribute("productos", productos);
        model.addAttribute("clientes", clientes);
        model.addAttribute("vendedores", vendedores);
        model.addAttribute("supervisorDeVentas",supervisorDeVentas);
        model.addAttribute("tipoVariedades", tipoVariedades);
        model.addAttribute("plantas", plantas);
        return "editarPedidoPendiente";
    }

    @PostMapping("/home/editarPedidoPendientes/{id}")
    public String actualizarPedidoPendientes(@PathVariable("id") Long id, @ModelAttribute("pedido") PedidoDTO pedidoDTO) {
        pedidoService.editarPedido2(id,pedidoDTO);
        return "redirect:/home/listarPedidosPendientes";
    }

    @GetMapping("/home/registroNuevoPedido")
    public String mostrarFormularioDeRegistro(Model model){
        List<Producto> productos = productoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        List<Vendedor> vendedores = vendedorRepository.findAll();
        List<SupervisorDeVenta> supervisorDeVentas = supervisorDeVentaRepository.findAll();
        List<TipoVariedad> tipoVariedades = tipoVariedadRepository.findAll();
        List<Planta> plantas = plantaRepository.findAll();
        model.addAttribute("productos", productos);
        model.addAttribute("clientes", clientes);
        model.addAttribute("vendedores", vendedores);
        model.addAttribute("supervisorDeVentas",supervisorDeVentas);
        model.addAttribute("tipoVariedades", tipoVariedades);
        model.addAttribute("plantas", plantas);
        return "registroNuevoPedido";
    }

    @GetMapping("/home/listarPedidosPendientes")
    public String mostrarFormularioDeListadoPendientes(Model model) {
        List<Pedido> pedidos = pedidoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("clientes", clientes);
        return "listarPedidosPendientes";
    }

    @GetMapping("/home/listarPedidos")
    public String mostrarFormularioDeListado(Model model) {
        List<Pedido> pedidos = pedidoRepository.findAll();
        List<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("clientes", clientes);
        return "listarPedidos";
    }

    @GetMapping("/home/generarReporte")
    public String mostrarFormularioDeReporte(Model model) {
        List<Pedido> pedidos = pedidoRepository.findAll();

        List<Pedido> pedidosFiltrados = pedidos.stream()
                .filter(pedido ->
                        pedido.getFecha_Pedido() != null &&
                                pedido.getProducto() != null && pedido.getProducto().getNombre_Producto() != null &&
                                pedido.getCliente() != null && pedido.getCliente().getNombre_Cliente() != null &&
                                pedido.getVendedor() != null && pedido.getVendedor().getNombre_Vendedor() != null &&
                                pedido.getSupervisorDeVenta() != null && pedido.getSupervisorDeVenta().getNombre_SupervisorDeVenta() != null &&
                                pedido.getFechaAprobacion_Pedido() != null &&
                                pedido.getTipoVariedad() != null && pedido.getTipoVariedad().getNombre_TipoVariedad() != null &&
                                pedido.getPlanta() != null && pedido.getPlanta().getUbicacion_Planta() != null
                )
                .toList();

        model.addAttribute("pedidos", pedidosFiltrados);
        return "generarReporte";
    }

    @GetMapping("/home/generarReporteMes")
    public String mostrarFormularioDeReporteMes(@RequestParam(required = false) Integer mes, Model model) {
        List<Pedido> pedidos = pedidoRepository.findAll();

        List<Pedido> pedidosFiltrados = pedidos.stream()
                .filter(pedido ->
                        pedido.getFecha_Pedido() != null &&
                                pedido.getProducto() != null && pedido.getProducto().getNombre_Producto() != null &&
                                pedido.getCliente() != null && pedido.getCliente().getNombre_Cliente() != null &&
                                pedido.getVendedor() != null && pedido.getVendedor().getNombre_Vendedor() != null &&
                                pedido.getSupervisorDeVenta() != null && pedido.getSupervisorDeVenta().getNombre_SupervisorDeVenta() != null &&
                                pedido.getFechaAprobacion_Pedido() != null &&
                                pedido.getTipoVariedad() != null && pedido.getTipoVariedad().getNombre_TipoVariedad() != null &&
                                pedido.getPlanta() != null && pedido.getPlanta().getUbicacion_Planta() != null
                )
                .toList();

        if (mes != null) {
            // Filtrar pedidos por el mes seleccionado
            pedidosFiltrados = pedidosFiltrados.stream()
                    .filter(pedido -> {
                        // Filtrar por el mes de la fecha de pedido
                        LocalDate fechaPedido = pedido.getFecha_Pedido();
                        return fechaPedido != null && fechaPedido.getMonthValue() == mes;
                    })
                    .toList();
        }

        model.addAttribute("pedidos", pedidosFiltrados);
        return "generarReporte";
    }

    @GetMapping("/home/listarPedidosPorCliente")
    public String listarPedidosPorCliente(@RequestParam Long idCliente, Model model) {
        List<Pedido> pedidosSinFiltrar = pedidoRepository.findAll();
        List<Pedido> pedidos = pedidosSinFiltrar.stream()
                .filter(pedido -> pedido.getCliente() != null && pedido.getCliente().getId_Cliente().equals(idCliente))
                .toList();
        List<Cliente> clientes = clienteRepository.findAll(); // mantener combo
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("clientes", clientes);
        return "listarPedidos";
    }

    @PostMapping("/home/registroNuevoPedido")
    public String registrarNuevoPedido(@ModelAttribute("pedido") PedidoDTO PedidoDTO){
        pedidoService.guardarPedido1(PedidoDTO);
        return "redirect:/home/registroNuevoPedido?exito";
    }

    @GetMapping("/home/exportarReporteExcel")
    public void exportarReporteExcel(HttpServletResponse response, @RequestParam(required = false) Integer mes) throws IOException {
        List<Pedido> pedidos = pedidoRepository.findAll();

        List<Pedido> pedidosFiltrados = pedidos.stream()
                .filter(pedido ->
                        pedido.getFecha_Pedido() != null &&
                                pedido.getProducto() != null && pedido.getProducto().getNombre_Producto() != null &&
                                pedido.getCliente() != null && pedido.getCliente().getNombre_Cliente() != null &&
                                pedido.getVendedor() != null && pedido.getVendedor().getNombre_Vendedor() != null &&
                                pedido.getSupervisorDeVenta() != null && pedido.getSupervisorDeVenta().getNombre_SupervisorDeVenta() != null &&
                                pedido.getFechaAprobacion_Pedido() != null &&
                                pedido.getTipoVariedad() != null && pedido.getTipoVariedad().getNombre_TipoVariedad() != null &&
                                pedido.getPlanta() != null && pedido.getPlanta().getUbicacion_Planta() != null
                )
                .toList();

        if (mes != null) {
            // Filtrar pedidos por el mes seleccionado
            pedidosFiltrados = pedidosFiltrados.stream()
                    .filter(pedido -> {
                        // Filtrar por el mes de la fecha de pedido
                        LocalDate fechaPedido = pedido.getFecha_Pedido();
                        return fechaPedido != null && fechaPedido.getMonthValue() == mes;
                    })
                    .toList();
        }

        // Crear un nuevo libro de trabajo (Excel)
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Pedidos");

        // Encabezados
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Fecha de Pedido");
        header.createCell(2).setCellValue("Producto");
        header.createCell(3).setCellValue("Cantidad");
        header.createCell(4).setCellValue("Monto Total");
        header.createCell(5).setCellValue("Vendedor");
        header.createCell(6).setCellValue("Cliente");
        header.createCell(7).setCellValue("Supervisor de Venta");
        header.createCell(8).setCellValue("Fecha Aprobación");
        header.createCell(9).setCellValue("Tipo Variedad");
        header.createCell(10).setCellValue("Planta");

        // Llenar los datos
        int rowNum = 1;
        for (Pedido pedido : pedidosFiltrados) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(pedido.getId_Pedido());
            row.createCell(1).setCellValue(pedido.getFecha_Pedido().toString());
            row.createCell(2).setCellValue(pedido.getProducto().getNombre_Producto());
            row.createCell(3).setCellValue(pedido.getCantidad_Pedido());
            row.createCell(4).setCellValue(pedido.getMontoTotal_Pedido());
            row.createCell(5).setCellValue(pedido.getVendedor().getNombre_Vendedor());
            row.createCell(6).setCellValue(pedido.getCliente().getNombre_Cliente());
            row.createCell(7).setCellValue(pedido.getSupervisorDeVenta().getNombre_SupervisorDeVenta());
            row.createCell(8).setCellValue(pedido.getFechaAprobacion_Pedido().toString());
            row.createCell(9).setCellValue(pedido.getTipoVariedad().getNombre_TipoVariedad());
            row.createCell(10).setCellValue(pedido.getPlanta().getUbicacion_Planta());
        }

        // Configurar la respuesta HTTP para descargar el archivo
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=pedidos.xlsx");

        // Escribir el archivo al output stream
        workbook.write(response.getOutputStream());
        workbook.close();
    }
}
