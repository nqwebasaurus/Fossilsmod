package fossils.fossils.client.blockentity.model.effigia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EffigiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bodyback;
	private final ModelPart legL;
	private final ModelPart legL2;
	private final ModelPart legL3;
	private final ModelPart legL4;
	private final ModelPart legL5;
	private final ModelPart legL6;
	private final ModelPart legL7;
	private final ModelPart legL8;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart bodymiddle;
	private final ModelPart bodyfront;
	private final ModelPart ArmL;
	private final ModelPart ArmL2;
	private final ModelPart ArmL3;
	private final ModelPart ArmL4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;

	public EffigiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bodyback = this.body.getChild("bodyback");
		this.legL = this.bodyback.getChild("legL");
		this.legL2 = this.legL.getChild("legL2");
		this.legL3 = this.legL2.getChild("legL3");
		this.legL4 = this.legL3.getChild("legL4");
		this.legL5 = this.bodyback.getChild("legL5");
		this.legL6 = this.legL5.getChild("legL6");
		this.legL7 = this.legL6.getChild("legL7");
		this.legL8 = this.legL7.getChild("legL8");
		this.tail = this.bodyback.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.bodymiddle = this.bodyback.getChild("bodymiddle");
		this.bodyfront = this.bodymiddle.getChild("bodyfront");
		this.ArmL = this.bodyfront.getChild("ArmL");
		this.ArmL2 = this.ArmL.getChild("ArmL2");
		this.ArmL3 = this.bodyfront.getChild("ArmL3");
		this.ArmL4 = this.ArmL3.getChild("ArmL4");
		this.neck = this.bodyfront.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 22.75F, 0.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.15F, -8.0F));

		PartDefinition bodyback = body.addOrReplaceChild("bodyback", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -12.3F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bodyback.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 30).mirror().addBox(-0.1565F, -0.8759F, -0.0023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4838F, 4.0552F, -1.9707F, 0.222F, 0.0502F, 0.0167F));

		PartDefinition cube_r2 = bodyback.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.5736F, 0.0899F, -0.0031F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7553F, 1.414F, -0.2186F, -0.8629F, -0.1001F, -0.1942F));

		PartDefinition cube_r3 = bodyback.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 31).mirror().addBox(-0.5F, -3.6105F, -1.0916F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7553F, 2.214F, 0.5814F, -1.0374F, -0.1001F, -0.1942F));

		PartDefinition cube_r4 = bodyback.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 23).mirror().addBox(-1.1646F, -2.1238F, -0.9853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7553F, 0.314F, 3.5814F, -0.2794F, -0.067F, -0.0762F));

		PartDefinition cube_r5 = bodyback.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(31, 50).mirror().addBox(-1.0F, 0.6243F, 1.0243F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0F, 3.0F, 0.7854F, 0.0F, -0.2182F));

		PartDefinition cube_r6 = bodyback.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-0.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(7, 41).mirror().addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(26, 0).addBox(2.5F, -0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(44, 5).mirror().addBox(0.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(44, 5).addBox(1.5F, -0.6F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F))
				.texOffs(7, 41).addBox(2.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-1.5F, -2.3F, 4.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bodyback.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(43, 52).mirror().addBox(-0.5F, 0.0341F, 0.0281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(43, 52).addBox(2.5F, 0.0341F, 0.0281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.7F, 6.1F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bodyback.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 16).mirror().addBox(-0.5F, -0.1118F, -2.9489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 16).addBox(2.5F, -0.1118F, -2.9489F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -3.8263F, 3.2964F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bodyback.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 11).mirror().addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(44, 11).addBox(2.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-1.5F, -2.8603F, 1.5376F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bodyback.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 30).addBox(-0.8435F, -0.8759F, -0.0023F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4838F, 4.0552F, -1.9707F, 0.222F, -0.0502F, -0.0167F));

		PartDefinition cube_r11 = bodyback.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-0.4264F, 0.0899F, -0.0031F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7553F, 1.414F, -0.2186F, -0.8629F, 0.1001F, 0.1942F));

		PartDefinition cube_r12 = bodyback.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 23).addBox(0.1646F, -2.1238F, -0.9853F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7553F, 0.314F, 3.5814F, -0.2794F, 0.067F, 0.0762F));

		PartDefinition cube_r13 = bodyback.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(13, 31).addBox(-0.5F, -3.6105F, -1.0916F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7553F, 2.214F, 0.5814F, -1.0374F, 0.1001F, 0.1942F));

		PartDefinition cube_r14 = bodyback.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(31, 50).addBox(0.0F, 0.6243F, 1.0243F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 3.0F, 0.7854F, 0.0F, 0.2182F));

		PartDefinition cube_r15 = bodyback.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(7, 48).addBox(0.0F, -1.1F, 3.7017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 16).addBox(0.0F, -1.1F, 1.7017F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(0.0F, -1.1F, -0.2983F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 1.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bodyback.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.2F, -0.3F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.9F, 1.3F, -0.0175F, 0.0F, 0.0F));

		PartDefinition legL = bodyback.addOrReplaceChild("legL", CubeListBuilder.create().texOffs(40, 39).addBox(-1.35F, -0.474F, -1.0672F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -0.65F, 4.05F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = legL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 52).addBox(-2.6F, -0.0559F, -0.0014F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 6.4824F, -1.1181F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r18 = legL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 50).addBox(-2.6F, -0.0564F, 0.051F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, 3.4824F, -1.1181F, -0.0175F, 0.0F, 0.0F));

		PartDefinition legL2 = legL.addOrReplaceChild("legL2", CubeListBuilder.create().texOffs(0, 15).addBox(-2.02F, 0.0F, -0.24F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 41).addBox(-1.52F, 0.0F, 0.86F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.75F, 9.5824F, -0.3681F, 1.2654F, 0.0F, 0.0F));

		PartDefinition legL3 = legL2.addOrReplaceChild("legL3", CubeListBuilder.create().texOffs(15, 17).addBox(-2.52F, -1.6262F, -0.0357F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 8.8468F, 1.0613F, -1.9635F, 0.0F, 0.0F));

		PartDefinition legL4 = legL3.addOrReplaceChild("legL4", CubeListBuilder.create().texOffs(0, 29).addBox(-2.52F, -0.4979F, -0.5487F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 4.05F, 0.5383F, -0.3054F, 0.0F, 0.0F));

		PartDefinition legL5 = bodyback.addOrReplaceChild("legL5", CubeListBuilder.create().texOffs(40, 39).mirror().addBox(-0.65F, -0.474F, -1.0672F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -0.65F, 4.05F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r19 = legL5.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(0.6F, -0.0559F, -0.0014F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 6.4824F, -1.1181F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r20 = legL5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(36, 50).mirror().addBox(0.6F, -0.0564F, 0.051F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.25F, 3.4824F, -1.1181F, -0.0175F, 0.0F, 0.0F));

		PartDefinition legL6 = legL5.addOrReplaceChild("legL6", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(0.02F, 0.0F, -0.24F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 41).mirror().addBox(0.52F, 0.0F, 0.86F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 9.5824F, -0.3681F, 1.0472F, 0.0F, 0.0F));

		PartDefinition legL7 = legL6.addOrReplaceChild("legL7", CubeListBuilder.create().texOffs(15, 17).mirror().addBox(-0.48F, -1.6262F, -0.0357F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.8468F, 1.0613F, -1.4399F, 0.0F, 0.0F));

		PartDefinition legL8 = legL7.addOrReplaceChild("legL8", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.48F, -0.4979F, -0.5487F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.05F, 0.5383F, -0.3054F, 0.0F, 0.0F));

		PartDefinition tail = bodyback.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -2.6F, 7.0F));

		PartDefinition cube_r21 = tail.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(13, 56).addBox(0.0F, 1.6836F, 1.9769F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(16, 56).addBox(0.0F, 0.1149F, -0.003F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.6939F, 3.8394F, 0.6469F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(59, 17).addBox(0.0F, 0.0319F, -0.0451F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.6939F, 1.1394F, 0.7341F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 31).addBox(0.0F, -0.4128F, 8.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(7, 41).addBox(0.0F, -0.4128F, 6.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(24, 41).addBox(0.0F, -0.4128F, 4.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(41, 28).addBox(0.0F, -0.4128F, 2.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(47, 28).addBox(0.0F, -0.4128F, 0.0019F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4061F, 0.1394F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(16, 18).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4061F, -1.8606F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.5189F, -0.6887F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5939F, 9.7394F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 31).addBox(0.0F, 6.8836F, 7.5624F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(61, 12).addBox(0.0F, 5.6097F, 6.0205F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(0, 57).addBox(0.0F, 2.5491F, 3.1011F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(9, 7).addBox(0.0F, 4.1817F, 4.6061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(6, 57).addBox(0.0F, 1.2753F, 1.5593F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(55, 56).addBox(0.0F, 0.0014F, 0.0174F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.4267F, -0.6888F, 0.7341F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.459F, -0.0748F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0189F, 11.2113F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(61, 6).addBox(0.0F, 1.1622F, -0.767F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(22, 31).addBox(0.0F, 2.4361F, 0.7748F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(16, 0).addBox(0.0F, 3.71F, 2.3167F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.1031F, 0.0792F, 0.6469F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(17, 3).addBox(-0.5F, -0.4103F, -0.1907F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.041F, 12.9252F, -0.2618F, 0.0F, 0.0F));

		PartDefinition bodymiddle = bodyback.addOrReplaceChild("bodymiddle", CubeListBuilder.create().texOffs(0, 29).addBox(-0.5F, -0.3016F, -9.6742F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.001F))
				.texOffs(37, 59).addBox(0.0F, -1.0016F, -9.6742F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(58, 35).addBox(0.0F, -1.2016F, -7.6742F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(58, 25).addBox(0.0F, -1.3016F, -5.6742F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(57, 43).addBox(0.0F, -1.3016F, -3.6742F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(54, 30).addBox(0.0F, -1.3016F, -1.6742F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.8F, 1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bodymiddle.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-2.3387F, 2.7056F, -1.0273F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.133F, -8.2947F, 0.3032F, -0.0017F, 0.2734F));

		PartDefinition cube_r28 = bodymiddle.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(32, 8).mirror().addBox(-2.3727F, 2.8276F, -0.2158F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.233F, -7.0947F, 0.2191F, 0.0219F, 0.2726F));

		PartDefinition cube_r29 = bodymiddle.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(16, 6).mirror().addBox(-0.5397F, 0.6007F, -0.412F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.333F, -2.9947F, 0.233F, -0.137F, 0.8235F));

		PartDefinition cube_r30 = bodymiddle.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(34, 58).mirror().addBox(-0.6357F, 0.5539F, -0.0301F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.533F, -5.2947F, 0.233F, -0.137F, 0.8235F));

		PartDefinition cube_r31 = bodymiddle.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(-0.4965F, 0.6614F, -0.2158F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.233F, -7.0947F, 0.1973F, -0.0985F, 0.8277F));

		PartDefinition cube_r32 = bodymiddle.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(58, 56).mirror().addBox(-0.5334F, 0.5403F, -1.0273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.133F, -8.2947F, 0.2571F, -0.1625F, 0.8199F));

		PartDefinition cube_r33 = bodymiddle.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 7).addBox(2.3387F, 2.7056F, -1.0273F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.133F, -8.2947F, 0.3032F, 0.0017F, -0.2734F));

		PartDefinition cube_r34 = bodymiddle.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(58, 56).addBox(0.5334F, 0.5403F, -1.0273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.133F, -8.2947F, 0.2571F, 0.1625F, -0.8199F));

		PartDefinition cube_r35 = bodymiddle.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(47, 58).addBox(0.4965F, 0.6614F, -0.2158F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.233F, -7.0947F, 0.1973F, 0.0985F, -0.8277F));

		PartDefinition cube_r36 = bodymiddle.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 8).addBox(2.3727F, 2.8276F, -0.2158F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.233F, -7.0947F, 0.2191F, -0.0219F, -0.2726F));

		PartDefinition cube_r37 = bodymiddle.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 58).addBox(0.6357F, 0.5539F, -0.0301F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.533F, -5.2947F, 0.233F, 0.137F, -0.8235F));

		PartDefinition cube_r38 = bodymiddle.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(16, 6).addBox(0.5397F, 0.6007F, -0.412F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.333F, -2.9947F, 0.233F, 0.137F, -0.8235F));

		PartDefinition cube_r39 = bodymiddle.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 17).addBox(-2.5F, -3.0F, -6.6F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 7.6984F, -3.0742F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bodyfront = bodymiddle.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0901F, -9.6943F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r40 = bodyfront.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.139F, -1.9182F, -0.8731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.017F, 0.9385F, -4.683F, -1.3342F, 0.0039F, 0.4681F));

		PartDefinition cube_r41 = bodyfront.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(23, 6).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.2254F, 0.1766F, -4.2544F, -0.5227F, 0.0039F, 0.4681F));

		PartDefinition cube_r42 = bodyfront.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(26, 50).mirror().addBox(-0.5F, -2.5F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.917F, 1.5385F, -4.883F, -0.8281F, 0.0039F, 0.4681F));

		PartDefinition cube_r43 = bodyfront.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(42, 34).mirror().addBox(0.3859F, -0.4384F, -0.8167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 3.8455F, -8.0746F, -0.515F, -0.3613F, -0.5584F));

		PartDefinition cube_r44 = bodyfront.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.4F, 4.4621F, -6.9369F, -0.5996F, 0.1245F, 0.1796F));

		PartDefinition cube_r45 = bodyfront.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.4F, 4.4621F, -6.9369F, -0.5996F, -0.1245F, -0.1796F));

		PartDefinition cube_r46 = bodyfront.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(42, 34).addBox(-1.3859F, -0.4384F, -0.8167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2F, 3.8455F, -8.0746F, -0.515F, 0.3613F, 0.5584F));

		PartDefinition cube_r47 = bodyfront.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(8, 0).addBox(-0.861F, -1.9182F, -0.8731F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.017F, 0.9385F, -4.683F, -1.3342F, -0.0039F, -0.4681F));

		PartDefinition cube_r48 = bodyfront.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(23, 6).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2254F, 0.1766F, -4.2544F, -0.5227F, -0.0039F, -0.4681F));

		PartDefinition cube_r49 = bodyfront.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(26, 50).addBox(-0.5F, -2.5F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.917F, 1.5385F, -4.883F, -0.8281F, -0.0039F, -0.4681F));

		PartDefinition cube_r50 = bodyfront.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(32, 8).addBox(-2.0F, -2.0384F, -2.9248F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.9727F, -1.8138F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bodyfront.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0013F, 4.2368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7844F, -8.9003F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bodyfront.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(59, 38).addBox(0.0F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(59, 45).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7175F, -3.1533F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bodyfront.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, -0.7582F, -0.9297F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(60, 3).addBox(0.0F, -0.7582F, -2.9297F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(34, 31).addBox(-0.5F, -0.1582F, -3.9297F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4183F, -4.7163F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r54 = bodyfront.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(3, 57).mirror().addBox(-2.0452F, 2.4266F, -0.4545F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5817F, -7.7163F, 0.2948F, 0.0007F, 0.2734F));

		PartDefinition cube_r55 = bodyfront.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(24, 17).mirror().addBox(-2.0102F, 2.5555F, -0.4589F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1817F, -5.9163F, 0.2527F, 0.0125F, 0.2732F));

		PartDefinition cube_r56 = bodyfront.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(41, 55).mirror().addBox(-2.0247F, 2.5861F, -0.1831F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1156F, -3.9003F, 0.2275F, 0.0195F, 0.2728F));

		PartDefinition cube_r57 = bodyfront.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-1.9994F, 2.6383F, -0.3204F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1156F, -1.6003F, 0.1939F, 0.0289F, 0.2719F));

		PartDefinition cube_r58 = bodyfront.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(28, 58).mirror().addBox(-0.2834F, 0.3012F, -0.3204F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1156F, -1.6003F, 0.1795F, -0.0792F, 0.8292F));

		PartDefinition cube_r59 = bodyfront.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(19, 57).mirror().addBox(-0.3328F, 0.2708F, -0.1831F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1156F, -3.9003F, 0.2032F, -0.1049F, 0.8271F));

		PartDefinition cube_r60 = bodyfront.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(31, 58).mirror().addBox(-0.337F, 0.2372F, -0.4589F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.1817F, -5.9163F, 0.2211F, -0.1241F, 0.825F));

		PartDefinition cube_r61 = bodyfront.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(59, 8).mirror().addBox(-0.4358F, 0.1472F, -0.4545F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5817F, -7.7163F, 0.251F, -0.1561F, 0.8208F));

		PartDefinition cube_r62 = bodyfront.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(59, 8).addBox(0.4358F, 0.1472F, -0.4545F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5817F, -7.7163F, 0.251F, 0.1561F, -0.8208F));

		PartDefinition cube_r63 = bodyfront.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(31, 58).addBox(0.337F, 0.2372F, -0.4589F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1817F, -5.9163F, 0.2211F, 0.1241F, -0.825F));

		PartDefinition cube_r64 = bodyfront.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(19, 57).addBox(0.3328F, 0.2708F, -0.1831F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1156F, -3.9003F, 0.2032F, 0.1049F, -0.8271F));

		PartDefinition cube_r65 = bodyfront.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(28, 58).addBox(0.2834F, 0.3012F, -0.3204F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1156F, -1.6003F, 0.1795F, 0.0792F, -0.8292F));

		PartDefinition cube_r66 = bodyfront.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(9, 57).addBox(1.9994F, 2.6383F, -0.3204F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1156F, -1.6003F, 0.1939F, -0.0289F, -0.2719F));

		PartDefinition cube_r67 = bodyfront.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(41, 55).addBox(2.0247F, 2.5861F, -0.1831F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1156F, -3.9003F, 0.2275F, -0.0195F, -0.2728F));

		PartDefinition cube_r68 = bodyfront.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(24, 17).addBox(2.0102F, 2.5555F, -0.4589F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1817F, -5.9163F, 0.2527F, -0.0125F, -0.2732F));

		PartDefinition cube_r69 = bodyfront.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(3, 57).addBox(2.0452F, 2.4266F, -0.4545F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5817F, -7.7163F, 0.2948F, -0.0007F, -0.2734F));

		PartDefinition ArmL = bodyfront.addOrReplaceChild("ArmL", CubeListBuilder.create().texOffs(49, 39).addBox(-0.25F, 0.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.7117F, -6.396F, 1.1727F, 0.1611F, -0.0674F));

		PartDefinition ArmL2 = ArmL.addOrReplaceChild("ArmL2", CubeListBuilder.create().texOffs(21, 50).addBox(-0.12F, 0.1587F, 0.1818F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(14, 51).addBox(-0.12F, 5.9587F, -0.7182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(7, 15).addBox(-0.12F, 0.1587F, -0.6182F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.15F, 5.55F, 0.3F, -2.1817F, 0.0F, 0.0F));

		PartDefinition ArmL3 = bodyfront.addOrReplaceChild("ArmL3", CubeListBuilder.create().texOffs(49, 39).mirror().addBox(-0.75F, 0.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 4.7117F, -6.396F, 1.0877F, -0.2163F, 0.0289F));

		PartDefinition ArmL4 = ArmL3.addOrReplaceChild("ArmL4", CubeListBuilder.create().texOffs(21, 50).mirror().addBox(-0.88F, 0.1587F, 0.1818F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(14, 51).mirror().addBox(-0.88F, 5.9587F, -0.7182F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(7, 15).mirror().addBox(-0.88F, 0.1587F, -0.6182F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.15F, 5.55F, 0.3F, -1.789F, 0.0F, 0.0F));

		PartDefinition neck = bodyfront.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6065F, -9.4627F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r70 = neck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(60, 22).addBox(0.0F, -0.5F, -1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8354F, 0.6594F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r71 = neck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(60, 27).addBox(0.0F, -0.3965F, -0.4027F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 6).addBox(-0.5F, 0.1035F, -0.4027F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1761F, -2.3685F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r72 = neck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-0.4387F, 0.2784F, -0.767F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0162F, 0.3234F, 0.9108F, -0.4896F, 0.3061F));

		PartDefinition cube_r73 = neck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(0.0827F, 0.8535F, -0.8056F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1761F, -2.3685F, 0.8184F, -0.242F, 0.542F));

		PartDefinition cube_r74 = neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(22, 58).mirror().addBox(-0.0785F, 0.7508F, -0.9296F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1761F, -4.7685F, 0.9894F, -0.3007F, 0.3211F));

		PartDefinition cube_r75 = neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(50, 58).addBox(0.4387F, 0.2784F, -0.767F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0162F, 0.3234F, 0.9108F, 0.4896F, -0.3061F));

		PartDefinition cube_r76 = neck.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 30).addBox(-0.0827F, 0.8535F, -0.8056F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1761F, -2.3685F, 0.8184F, 0.242F, -0.542F));

		PartDefinition cube_r77 = neck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(22, 58).addBox(0.0785F, 0.7508F, -0.9296F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1761F, -4.7685F, 0.9894F, 0.3007F, -0.3211F));

		PartDefinition cube_r78 = neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(60, 30).addBox(0.0F, -0.6978F, 0.5489F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1761F, -4.7685F, -0.0524F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3588F, -2.659F, -0.1355F, -0.2595F, 0.035F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(60, 33).addBox(0.0F, -0.7326F, 4.1515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 42).addBox(0.0F, -0.7326F, 2.1515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 51).addBox(0.0F, -0.7326F, 0.1515F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 31).addBox(-0.5F, -0.1326F, 0.1515F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.432F, -7.7654F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(25, 58).mirror().addBox(1.0764F, 3.3156F, 0.9247F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.432F, -7.7654F, 1.1487F, -0.4149F, 0.1393F));

		PartDefinition cube_r81 = neck2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 4).mirror().addBox(0.1486F, 1.3798F, -0.4478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.432F, -7.7654F, 1.3233F, -0.4149F, 0.1393F));

		PartDefinition cube_r82 = neck2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(25, 58).addBox(-1.0764F, 3.3156F, 0.9247F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.432F, -7.7654F, 1.1487F, 0.4149F, -0.1393F));

		PartDefinition cube_r83 = neck2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(57, 4).addBox(-0.1486F, 1.3798F, -0.4478F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.432F, -7.7654F, 1.3233F, 0.4149F, -0.1393F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.082F, -7.3154F, 0.1168F, -0.4389F, -0.3527F));

		PartDefinition cube_r84 = neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(44, 56).mirror().addBox(-0.5103F, 0.1487F, -0.5035F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.128F, -1.4628F, 0.978F, -0.2143F, 0.0633F));

		PartDefinition cube_r85 = neck3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(24, 23).mirror().addBox(-0.4511F, 0.4361F, -1.1796F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, 1.0956F, -0.3931F, 0.1946F));

		PartDefinition cube_r86 = neck3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(44, 56).addBox(0.5103F, 0.1487F, -0.5035F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.128F, -1.4628F, 0.9385F, 0.3931F, -0.1946F));

		PartDefinition cube_r87 = neck3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(24, 23).addBox(0.4511F, 0.4361F, -1.1796F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, 1.0956F, 0.3931F, -0.1946F));

		PartDefinition cube_r88 = neck3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(54, 52).addBox(-0.5F, -1.475F, 0.15F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(0.0F, 1.5F, -5.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r89 = neck3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(53, 60).addBox(0.0F, -0.6878F, 1.9507F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 60).addBox(0.0F, -0.6878F, -0.0493F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 31).addBox(-0.5F, -0.1878F, -2.0493F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.6F, -4.0F, 0.0087F, 0.0F, 0.0F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0258F, -4.4268F, 0.303F, 0.0393F, -0.1249F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create().texOffs(7, 48).addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 1.2776F, -0.3125F, 0.0432F, 0.0499F, 0.0F));

		PartDefinition cube_r90 = lowerjaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-1.1613F, -1.3147F, -6.2775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0125F)).mirror(false), PartPose.offsetAndRotation(-1.3461F, 0.5F, -0.059F, 0.3491F, -0.2007F, 0.0F));

		PartDefinition cube_r91 = lowerjaw.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(51, 35).mirror().addBox(-1.1613F, -3.387F, -7.4419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-1.3461F, 0.5F, -0.059F, 0.6981F, -0.2007F, 0.0F));

		PartDefinition cube_r92 = lowerjaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(48, 54).mirror().addBox(-1.1613F, -0.4255F, -7.3641F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3461F, 0.5F, -0.059F, 0.2967F, -0.2007F, 0.0F));

		PartDefinition cube_r93 = lowerjaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(52, 36).addBox(-1.4521F, 0.0185F, -2.0833F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3461F, 1.4F, -6.459F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r94 = lowerjaw.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(51, 35).addBox(-0.4521F, 0.0185F, -1.9833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3461F, 1.4F, -6.459F, 0.6981F, 0.096F, 0.0F));

		PartDefinition cube_r95 = lowerjaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(48, 54).addBox(-0.5096F, -0.8747F, 0.0593F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3461F, 3.1F, -7.059F, 0.2967F, 0.096F, 0.0F));

		PartDefinition cube_r96 = lowerjaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(48, 21).addBox(-0.3658F, -0.1F, -0.8936F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.3461F, 1.2F, -5.559F, 0.3491F, 0.096F, 0.0F));

		PartDefinition cube_r97 = lowerjaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(24, 45).mirror().addBox(-0.6739F, -1.1653F, -5.4396F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(33, 45).mirror().addBox(-0.6539F, -1.5653F, -5.5396F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 28).mirror().addBox(-0.6539F, -0.8653F, -5.5396F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3461F, 0.5F, -0.059F, 0.384F, -0.1047F, 0.0F));

		PartDefinition cube_r98 = lowerjaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(7, 48).mirror().addBox(-0.6539F, -0.5F, -2.941F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.3461F, 0.5F, -0.059F, 0.0F, -0.1047F, 0.0F));

		PartDefinition cube_r99 = lowerjaw.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(54, 13).mirror().addBox(-0.6539F, -0.9074F, -2.7616F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3461F, 0.5F, -0.059F, 0.4014F, -0.1047F, 0.0F));

		PartDefinition cube_r100 = lowerjaw.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 13).addBox(-0.5F, -1.0F, -1.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.0F, -1.0F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r101 = lowerjaw.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(41, 28).addBox(-0.5F, 1.4118F, -1.2384F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 0.0F, -4.9F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r102 = lowerjaw.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(24, 45).addBox(-0.48F, 0.4F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(33, 45).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -3.0F, 0.384F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.5F, 1.2776F, -0.3125F));

		PartDefinition cube_r103 = upperjaw.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(16, 41).addBox(-1.5F, 0.0041F, -2.97F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.8F, -4.8F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r104 = upperjaw.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(54, 39).mirror().addBox(-0.1342F, -0.8938F, -1.9556F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0125F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.4F, -6.9F, 0.412F, -0.2403F, -0.063F));

		PartDefinition cube_r105 = upperjaw.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(52, 45).mirror().addBox(-0.4981F, -0.214F, -1.351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(5, 36).mirror().addBox(-0.4981F, -0.614F, 0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(7, 53).mirror().addBox(-0.4981F, -0.614F, -1.351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-1.333F, -1.382F, -6.404F, 0.5818F, -0.0231F, 0.0481F));

		PartDefinition cube_r106 = upperjaw.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(13, 46).mirror().addBox(-0.3355F, -1.0F, -2.7839F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0125F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.6F, -5.0F, 0.192F, -0.096F, 0.0F));

		PartDefinition cube_r107 = upperjaw.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(30, 45).mirror().addBox(-0.3921F, -0.6148F, -0.1687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0125F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, -1.3852F, -4.8992F, 0.0F, -0.0262F, 0.0F));

		PartDefinition cube_r108 = upperjaw.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(13, 41).mirror().addBox(-0.5021F, -0.6943F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, -1.3852F, -4.8992F, 0.5411F, -0.0262F, 0.0F));

		PartDefinition cube_r109 = upperjaw.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(51, 8).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0125F)).mirror(false), PartPose.offsetAndRotation(-1.3341F, -1.6F, -3.9632F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r110 = upperjaw.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(53, 26).mirror().addBox(-0.5321F, -0.3431F, -1.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.4379F, -1.3852F, -4.8992F, 0.0175F, -0.0262F, 0.0F));

		PartDefinition cube_r111 = upperjaw.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(54, 39).addBox(-0.8658F, -0.8938F, -1.9556F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.5F, -0.4F, -6.9F, 0.412F, 0.2403F, 0.063F));

		PartDefinition cube_r112 = upperjaw.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(13, 46).addBox(-0.6645F, -1.0F, -2.7839F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.5F, -0.6F, -5.0F, 0.192F, 0.096F, 0.0F));

		PartDefinition cube_r113 = upperjaw.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-1.3F, -1.005F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 36).addBox(0.3F, -1.005F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(16, 0).addBox(-1.5F, -1.0F, -1.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -2.0F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r114 = upperjaw.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-0.5F, -0.0012F, -0.0616F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.6832F, -2.5267F, -0.5549F, -0.2967F, 0.0436F, 0.0F));

		PartDefinition cube_r115 = upperjaw.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(55, 21).mirror().addBox(-0.3554F, -0.1202F, -0.7409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9167F, -2.5389F, -0.9632F, -0.2967F, -0.0436F, 0.0F));

		PartDefinition cube_r116 = upperjaw.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(-1.6832F, -1.5267F, -0.5549F, -0.4538F, 0.0436F, 0.0F));

		PartDefinition cube_r117 = upperjaw.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(30, 17).mirror().addBox(-0.5533F, -0.8702F, -1.1931F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(49, 49).mirror().addBox(-0.5433F, -0.8702F, -1.1931F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false)
				.texOffs(22, 31).mirror().addBox(-0.3117F, -0.8702F, -2.1931F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9167F, -1.9389F, -1.9632F, -0.0174F, 0.0F, -0.0008F));

		PartDefinition cube_r118 = upperjaw.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(32, 0).addBox(-0.5F, -0.0012F, -0.0616F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6832F, -2.5267F, -0.5549F, -0.2967F, -0.0436F, 0.0F));

		PartDefinition cube_r119 = upperjaw.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(55, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(0.6832F, -1.5267F, -0.5549F, -0.4538F, -0.0436F, 0.0F));

		PartDefinition cube_r120 = upperjaw.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(30, 17).addBox(-0.4467F, -0.8702F, -1.1931F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(49, 49).addBox(-0.4567F, -0.8702F, -1.1931F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(22, 31).addBox(-0.6883F, -0.8702F, -2.1931F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9167F, -1.9389F, -1.9632F, -0.0174F, 0.0F, 0.0008F));

		PartDefinition cube_r121 = upperjaw.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(55, 21).addBox(-0.6446F, -0.1202F, -0.7409F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9167F, -2.5389F, -0.9632F, -0.2967F, 0.0436F, 0.0F));

		PartDefinition cube_r122 = upperjaw.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(53, 26).addBox(-0.4679F, -0.3431F, -1.0139F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4379F, -1.3852F, -4.8992F, 0.0175F, 0.0262F, 0.0F));

		PartDefinition cube_r123 = upperjaw.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(5, 36).addBox(-0.5019F, -0.614F, 0.049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(52, 45).addBox(-0.5019F, -0.214F, -1.351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
				.texOffs(7, 53).addBox(-0.5019F, -0.614F, -1.351F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.333F, -1.382F, -6.404F, 0.5818F, 0.0231F, -0.0481F));

		PartDefinition cube_r124 = upperjaw.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(13, 41).addBox(-0.4979F, -0.6943F, -0.7503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4379F, -1.3852F, -4.8992F, 0.5411F, 0.0262F, 0.0F));

		PartDefinition cube_r125 = upperjaw.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(30, 45).addBox(-0.6079F, -0.6148F, -0.1687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.4379F, -1.3852F, -4.8992F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r126 = upperjaw.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(51, 8).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0125F)), PartPose.offsetAndRotation(0.3341F, -1.6F, -3.9632F, 0.0F, 0.0087F, 0.0F));

		PartDefinition cube_r127 = upperjaw.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(36, 55).addBox(-0.5293F, -1.9759F, -0.0196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -9.0F, -1.0603F, 0.0191F, 0.0145F));

		PartDefinition cube_r128 = upperjaw.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(56, 49).addBox(-0.538F, -0.9771F, -0.3154F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.5F, 0.5F, -8.7F, 0.0044F, 0.0191F, 0.0145F));

		PartDefinition cube_r129 = upperjaw.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(50, 3).mirror().addBox(-1.5F, -0.6F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(50, 3).addBox(0.5F, -0.6F, -1.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.1308F, 0.4966F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r130 = upperjaw.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 46).mirror().addBox(-1.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(19, 46).addBox(0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.3794F, -0.6719F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r131 = upperjaw.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(27, 41).addBox(-1.5F, -0.9884F, -1.9385F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0352F, -2.0285F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r132 = upperjaw.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(41, 0).addBox(-1.5F, -0.8F, -0.6F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -1.3352F, -1.6285F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r133 = upperjaw.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(42, 46).addBox(-1.0F, -0.0685F, -1.4907F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.8F, -3.3F, 0.0524F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}