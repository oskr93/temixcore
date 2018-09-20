package com.xoftix.temixcore.as.service;

public class GenericService<T> {
	
	/*private List<T> listaDS;
	
	public T guardar(T astDataSource) {
		if(astDataSource.getId()==null) {
			astDataSource.setId(Long.parseLong(""+listaDS.size()));
		}else {
			Integer indice = buscar(astDataSource);
			
			if(indice > -1) {
				listaDS.set(indice,astDataSource);
			}else {
				listaDS.add(astDataSource);
			}
			
		}
		
		
		listaDS.add(astDataSource)
;		return astDataSource;
	}
	
	public void eliminar(Long id) {
		listaDS.remove(id);
	}
	
	public T consultar(Long id) {
		
		for (T dataSource : listaDS) {
			if(dataSource.getId().equals(id)){
				return dataSource;
			}
		}
		return null;
	}
	
	public List<T> listar(){
		return listaDS;
	}
	
	private Integer buscar(T astDataSource) {
		for (int i = 0; i < listaDS.size(); i++) {
			if(listaDS.get(i).getId().equals(astDataSource)) {
				return i;
			}
		}
		
		return -1;
	}*/

}
