package com.lvefunc.workcenter.ui.controller.item;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.ModelFactory;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class MaterialsController implements IItemController<Material> {
	@Inject
	@Named("materials")
	private Map<Integer, Material> materials;
	
	@Override
	public Material create(String name) {
		Optional<Material> optional = materials.values().stream()
			.filter(m -> m.getName().equals(name))
			.findFirst();
		
		if (!optional.isEmpty())
			return optional.get();
		
		Material material = ModelFactory.eINSTANCE.createMaterial();
		material.setName(name);

		materials.put(material.getId(), material);		

		return material;
	}

	@Override
	public Material update(int id, String name) {
		Material material = materials.get(id);
		material.setName(name);
		
		return material;
	}

	@Override
	public void remove(int id) {
		materials.remove(id);
	}

	@Override
	public int indexOf(Material material) {
		Optional<Map.Entry<Integer, Material>> optional = materials.entrySet().stream()
			.filter(e -> e.getValue().equals(material))
			.findFirst();
		
		if (optional.isEmpty())
			return -1;
		else
			return optional.get().getKey();
	}
	
	@Override
	public Material get(String name) {
		Optional<Material> optional = materials.values().stream()
				.filter(m -> m.getName().equals(name))
				.findFirst();
			
		if (!optional.isEmpty())
			return optional.get();
		throw new IllegalArgumentException();
	}

	@Override
	public Collection<Material> getAll() {
		return materials.values();
	}
}
