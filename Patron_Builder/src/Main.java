public class Main {
    public static void main(String[] args) {
        // Crear un correo electrónico usando el patrón Builder
        Email email = new Email.Builder()
                .addTo("angeljosueochoacalde@gmail.com")
                .addTo("pruebadetestjuan@gmail.com")
                .setSubject("Exposicion")
                .setBody("Que tal chicos la exposicion sera de 7:15 Pm a 8:45 Pm")
                .addAttachment("agenda.pdf")
                .build();

        // Mostrar los detalles del correo
        System.out.println("Destinatarios: " + email.getTo());
        System.out.println("Asunto: " + email.getSubject());
        System.out.println("Cuerpo: " + email.getBody());
        System.out.println("Adjuntos: " + email.getAttachments());
    }
}
