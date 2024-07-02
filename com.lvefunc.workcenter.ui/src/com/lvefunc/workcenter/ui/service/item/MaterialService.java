package com.lvefunc.workcenter.ui.service.item;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.lvefunc.workcenter.model.Material;
import com.lvefunc.workcenter.model.ModelFactory;

public class MaterialService implements IItemService<Material> {
	private Map<Integer, Material> materials = new HashMap<>();
	
	@Override
	public Material create(String name) {
		var optional = get(name);
		
		if (!optional.isEmpty())
			return optional.get();

		var material = ModelFactory.eINSTANCE.createMaterial();
		material.setName(name);

		materials.put(material.getId(), material);

		return material;
	}

	@Override
	public Material update(int id, String name) {
		var optional = get(id);
		
		if (optional.isEmpty())
			throw new IllegalArgumentException();
		
		var material = optional.get();
		material.setName(name);

		return material;
	}

	@Override
	public void remove(int id) {
		materials.remove(id);
	}

	@Override
	public Optional<Material> get(int id) {
		return Optional.ofNullable(materials.get(id));
	}
	
	@Override
	public Optional<Material> get(String name) {
		return materials.values().stream()
				.filter(material -> material.getName().equals(name))
				.findFirst();
	}

	@Override
	public Collection<Material> getAll() {
		return materials.values();
	}
	
	@Override
	public int indexOf(Material material) {
		var optional = materials.entrySet().stream()
				.filter(entry -> entry.getValue().equals(material))
				.findFirst();

		if (!optional.isEmpty())
			optional.get().getKey();
		return -1;
	}
}
