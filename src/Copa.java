public class Copa {
    public class Copa {
        private String tipoLiquido;
        private double porcentajeLlena;
        public String getTipoLiquido() {
            return tipoLiquido;
        }
        public void setTipoLiquido(String tipoLiquido) {
            this.tipoLiquido = tipoLiquido;
        }
        public double getPorcentajeLlena() {
            return porcentajeLlena;
        }
        public void setPorcentajeLlena(double porcentajeLlena) {
            this.porcentajeLlena = porcentajeLlena;
        }
        public Copa(String tipoLiquido, double porcentajeLlena) {
            this.tipoLiquido = tipoLiquido;
            this.porcentajeLlena = porcentajeLlena;
        }
    }
}
